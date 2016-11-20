## Liquibase Issue

Running the following example will cause a HikariPool$PoolInitializationException when running against MS SQL Server.

The issue arises due to liquibase attempting to create it's own Hikari Datasource.  However it doesn't set the connectionTestQuery param for Hikari causing Hikari to fail:
 `HikariPool-1 - Failed to execute isValid() for connection, configure connection test query. (null)`
 
 If you don't set the liquibase.url property liquibase will use the datasource created by the spring.datasource properties.