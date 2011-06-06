// A test to verify that protoc location is picked up from 'protobuf' tool chain,
// and proto compilation completes successfully.

outputDirectory = new File(basedir, 'target/generated-sources/protoc');
assert outputDirectory.exists();
assert outputDirectory.isDirectory();

generatedJavaFile = new File(outputDirectory, 'test/TestProtos.java');
assert generatedJavaFile.exists();
assert generatedJavaFile.isFile();

content = generatedJavaFile.text;
assert content.contains('package test');
assert content.contains('class Test');
assert content.contains('class TestMessage');

return true;