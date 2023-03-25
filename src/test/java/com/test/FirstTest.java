package com.test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FirstTest {


	public static String getPayload(final String fileNm) throws IOException, JSONException {

		final File file = new File("src/test/resources/" + fileNm);

		final Path path = file.toPath();

		final StringBuilder sb = new StringBuilder();
		final List<String> content = Files.readAllLines(path, Charset.defaultCharset());

		for (final String string : content) {

			sb.append(string);
		}
		return sb.toString();
	}

	@Test
	@Category(com.test.FirstTest.class)
	public void testmethod1() throws JSONException, IOException {

		String payload = getPayload("gitLabjob.json");
		JSONObject json = new JSONObject(payload);

		System.out.println("after update");
		json.put("build_id", 101);

	}

	@Test
	@Category(com.test.FirstTest.class)
	public void testmethod2() {
		assertTrue(true);
	}

	@Test
	@Category(com.test.FirstTest.class)
	public void emptytest() {
		/*
		// Empty test
		*/
	}

	@Test
	@Category(com.test.FirstTest.class)
	public void failedtest() {
		assertFalse(true, "balu-test is failed");
	}

	@Ignore
	@Test()
	@Category(com.test.FirstTest.class)
	public void disabledtest() {
		/*
		// Disabled test
		*/
	}
}
