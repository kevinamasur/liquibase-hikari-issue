## NGC GPS Service

> Provides endpoints for Sonic-U GPS Devices

### Liquibase updates

The provided ./liquibase-template.sh script can be used to create a new liquibase file

./liquibase-template.sh GPS-45 Example_Liquibase_Desc

The result of that will create an xml file in the src/main/resources/db folder that you can put your liquibase xml into

Don't forget when creating views, or procs that access or modify data in dbo to update the GPS user permissions.

Those permissions can be updated in src/main/resources/db/00000000_000000.Set_User_Permissions.xml

NOTE: Liquibase does not currently offer an xml equivalent for granting database permissions.  You will have to use sql statements.