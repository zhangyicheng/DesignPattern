package com.TemplateMethodModel;

public class TemplateMethodModel {
	public static void test() { // ∂‡Ã¨
		BaseTest sina = new SinaTest();
		BaseTest tencent = new TencentTest();
		sina.ask();
		tencent.ask();
	}
}
