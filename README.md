# javarepo

Project Desc:
This is to generate the client based on the wsdl file given.
This approach is based on the JAXWS based WS client generation.

Steps:

1. Create a src folder
2. Create a wsdl folder under src

or Run maven goal >> mvn:generated-soruces

3. Copy the wsdl file in to your/project/path/src/wsdl/file.wsdl
4. Make sure that, pom.xml file should be in the root of the project
5. run maven clean through eclipse
6. run maven install through eclipse
7. On eclipse, select the pom.xml file >> run as >> maven build.. >> enter goals "jaxws:wsimport" >> click "Run"
