package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestMoveFile {
	public static void main(String [] args) throws IOException {
//		File f = new File("/Users/chenxu/Test.zip");
		FileUtils.moveFile(new File("/Users/chenxu/CCTest.zip"), new File("/Users/chenxu/CC/Test.zip"));
//		}
	}
}
