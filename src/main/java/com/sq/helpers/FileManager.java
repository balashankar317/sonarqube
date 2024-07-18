package com.sq.helpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
	public static File createTempFileWithData(String prefix, String data) throws IOException {
		File inFile = null;

		inFile = File.createTempFile(prefix, ".txt");

		try (FileOutputStream fileOutputStream = new FileOutputStream(inFile);) {
			fileOutputStream.write(data.getBytes());
		}

		return inFile;
	}
}
