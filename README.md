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

[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.xxxx.wsdl.client.tutorial:xxxx-wsdl-client-tutorial:jar:0.0.1-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 55, column 12
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] Using the builder org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder with a thread count of 1
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building xxxx-wsdl-client-tutorial 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[WARNING] The POM for com.sun.istack:istack-commons-runtime:jar:1.1 is missing, no dependency information available
[WARNING] The POM for woodstox:wstx-asl:jar:3.2.1 is missing, no dependency information available
[INFO] 
[INFO] --- jaxws-maven-plugin:2.4.1:wsimport (default-cli) @ born-wsdl-client-tutorial ---
[INFO] Processing: file:/D:/users/CCCC/git/javarepo/src/wsdl/WSReservationService.wsdl
[WARNING] Using platform encoding (Cp1252), build is platform dependent!
[INFO] jaxws:wsimport args: [-keep, -s, 'D:\users\CCCC\git\javarepo\src\main\java', -d, 'D:\users\CCCC\git\javarepo\target\classes', -verbose, -extension, -Xnocompile, "file:/D:/users/CCCC/git/javarepo/src/wsdl/WSReservationService.wsdl"]
parsing WSDL...



Generating code...

com\agimatec\publicinterfaces\service\BoxSize.java
com\agimatec\publicinterfaces\service\CallerInfo.java
com\agimatec\publicinterfaces\service\CancelReservation.java
com\agimatec\publicinterfaces\service\CancelReservationResponse.java
com\agimatec\publicinterfaces\service\ComfortZone.java
com\agimatec\publicinterfaces\service\DeviceType.java
com\agimatec\publicinterfaces\service\DtAddress.java
com\agimatec\publicinterfaces\service\DtAvailableBoxes.java
com\agimatec\publicinterfaces\service\DtBox.java
com\agimatec\publicinterfaces\service\DtBoxGroup.java
com\agimatec\publicinterfaces\service\DtDeliveryMachine.java
com\agimatec\publicinterfaces\service\DtDevice.java
com\agimatec\publicinterfaces\service\DtMachineAddress.java
com\agimatec\publicinterfaces\service\DtMachineBoxesOverview.java
com\agimatec\publicinterfaces\service\DtMachineProperty.java
com\agimatec\publicinterfaces\service\DtReservation.java
com\agimatec\publicinterfaces\service\DtTag.java
com\agimatec\publicinterfaces\service\GetAllMachines.java
com\agimatec\publicinterfaces\service\GetAllMachinesResponse.java
com\agimatec\publicinterfaces\service\GetAvailableBoxSizes.java
com\agimatec\publicinterfaces\service\GetAvailableBoxSizesResponse.java
com\agimatec\publicinterfaces\service\GetAvailableFreeBoxesForMachine.java
com\agimatec\publicinterfaces\service\GetAvailableFreeBoxesForMachineResponse.java
com\agimatec\publicinterfaces\service\GetAvailableProductCodes.java
com\agimatec\publicinterfaces\service\GetAvailableProductCodesResponse.java
com\agimatec\publicinterfaces\service\GetAvailableTags.java
com\agimatec\publicinterfaces\service\GetAvailableTagsResponse.java
com\agimatec\publicinterfaces\service\GetCurrentMachineBoxesOverview.java
com\agimatec\publicinterfaces\service\GetCurrentMachineBoxesOverviewResponse.java
com\agimatec\publicinterfaces\service\GetCurrentMachineBoxesState.java
com\agimatec\publicinterfaces\service\GetCurrentMachineBoxesStateResponse.java
com\agimatec\publicinterfaces\service\GetMachineDetails.java
com\agimatec\publicinterfaces\service\GetMachineDetailsResponse.java
com\agimatec\publicinterfaces\service\GetMachineDetailsWithTagAndLifecycleStatus.java
com\agimatec\publicinterfaces\service\GetMachineDetailsWithTagAndLifecycleStatusResponse.java
com\agimatec\publicinterfaces\service\GetMachinesWithTag.java
com\agimatec\publicinterfaces\service\GetMachinesWithTagResponse.java
com\agimatec\publicinterfaces\service\MachineConstructionType.java
com\agimatec\publicinterfaces\service\MachineLifecycleStatus.java
com\agimatec\publicinterfaces\service\MachineLocationType.java
com\agimatec\publicinterfaces\service\ObjectFactory.java
com\agimatec\publicinterfaces\service\PublicServiceException.java
com\agimatec\publicinterfaces\service\PublicServiceException_Exception.java
com\agimatec\publicinterfaces\service\ReservationServiceException.java
com\agimatec\publicinterfaces\service\ReservationServiceException_Exception.java
com\agimatec\publicinterfaces\service\ReserveCompartment.java
com\agimatec\publicinterfaces\service\ReserveCompartmentResponse.java
com\agimatec\publicinterfaces\service\TagType.java
com\agimatec\publicinterfaces\service\WSReservationService.java
com\agimatec\publicinterfaces\service\WSReservationService_Service.java
com\agimatec\publicinterfaces\service\package-info.java
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 5.157 s
[INFO] Finished at: 2016-06-08T14:03:25+05:30
[INFO] Final Memory: 7M/123M
[INFO] ------------------------------------------------------------------------
