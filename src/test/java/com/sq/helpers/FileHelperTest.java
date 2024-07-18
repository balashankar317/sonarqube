package com.sq.helpers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileHelperTest {
	FileHelper fileHelper;
	File dataFile;
	File oneCharFile;
	File emptyFile;

	@BeforeEach
	public void init() throws IOException {
		fileHelper = new FileHelper();
		dataFile = FileManager.createTempFileWithData("data-",
				"JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation Framework");
		oneCharFile = FileManager.createTempFileWithData("singlechar-", "J");
		emptyFile = FileManager.createTempFileWithData("empty-", "");
	}

	@Test
	public void testCharsWithDataFile() {
		assertTimeout(Duration.ofMillis(6000), () -> {
			long expectedChars = 3312;
			long actualChars = 0;
			actualChars = fileHelper.chars(dataFile.getAbsolutePath());
			assertEquals(expectedChars, actualChars);
		});
	}

	@Test
	public void testCharsWithSingleCharFile() {
		long expectedChars = 1;
		long actualChars = 0;

		actualChars = fileHelper.chars(oneCharFile.getAbsolutePath());
		assertEquals(expectedChars, actualChars);
	}

	@Test
	public void testCharsWithEmptyFile() {
		long expectedChars = 0;
		long actualChars = 0;

		actualChars = fileHelper.chars(emptyFile.getAbsolutePath());
		assertEquals(expectedChars, actualChars);
	}

	@AfterEach
	public void cleanUp() {
		dataFile.delete();
		oneCharFile.delete();
		emptyFile.delete();
	}
}
