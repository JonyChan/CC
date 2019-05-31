package Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class warUpload extends HttpServlet {

	private static final long serialVersionUID = 1L;
    

    // 上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "upload";

    // 上传配置-单位字节
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB

    /**
     * 上传数据及保存文件
     */
    protected void doPost(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        // 1.判断是否为多媒体上传
        if (!ServletFileUpload.isMultipartContent(request)) {
            // 如果不是则停止
            PrintWriter writer = response.getWriter();
            writer.println("Error: the form must include:enctype=multipart/form-data");
            writer.flush();
            return;
        }

        //2.开始配置上传参数-创建fileItem工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();

     // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
        factory.setSizeThreshold(MEMORY_THRESHOLD);

        // 设置临时存储目录
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        //创建文件上传核心组件
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 设置最大上传文件的阈值
        upload.setFileSizeMax(MAX_FILE_SIZE);

        // 设置最大请求值 (包含文件和表单数据)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // 构造临时路径来存储上传的文件
        // 这个路径相对当前应用的目录
//        String uploadPath = getServletContext().getRealPath("/") + File.separator + UPLOAD_DIRECTORY;
//        String uploadPath = getServletContext().getRealPath("/") ;
        String uploadPath = getServletContext().getRealPath("/") ;
//        System.out.println(getServletContext());

        // 如果目录不存在则创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        try {

            // 解析请求的内容提取文件数据
            List<FileItem> formItems = upload.parseRequest(request);

            //遍历Items
            if (formItems != null && formItems.size() > 0) {
                // 迭代表单数据
                for (FileItem item : formItems) {
                    // 处理不在表单中的字段
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        //获取文件保存在服务器的路径
//                        String filePath = uploadPath + File.separator + fileName;
                        String filePath = uploadPath  + fileName;
                        System.out.println(uploadPath);
                        File storeFile = new File(filePath);
//                        FileUtils.moveFile(new File(filePath), new File("/Users/chenxu/lib/apache-tomcat-8.5.39/webapps"+File.separator+fileName));
                      
//                        String newFilePath = "/Users/chenxu/lib/apache-tomcat-8.5.39/webapps"+File.separator+fileName;
                        
                        String newFilePath = "/var/lib/tomcat8/webapps"+File.separator+fileName;
                        File newstoreFile = new File(newFilePath);
                        

                        // 在控制台输出文件的上传路径
                        System.out.println(newFilePath);

                        // 保存文件到硬盘
                        item.write(newstoreFile);
                        request.setAttribute("message",
                            "the war had uploaded successfully"
                            );
                    }
                }
            }
        } catch (Exception ex) {
//            request.setAttribute("message",
//                    "错误信息: " + ex.getMessage());
        	System.out.println(ex.getMessage());
        }
        

        // 跳转到 message.jsp
        getServletContext().getRequestDispatcher("/jsp/private/upload2.jsp").forward(
                request, response);
        
        
    }
}
