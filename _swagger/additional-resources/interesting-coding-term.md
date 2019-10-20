## sphagetti code or big ball of mud
## microservices should be two pizza team i.e. 12 people i.e. 12 end point
## netflix -- chaos monkey learn about this
## single responsiblity principle.
## https://12factor.net/
## trace request
## safe methods --> get, head, trace, options since they do not alter data on server
## webflux
## comparing branches in git
## install tcpmon this is based on request forwarding to 8081 and it actually forwards to 8080 i.e. target port
## dev tools is a droovy wrapper and has two class loaders
### one for jar dependency
### one for the compiled class this makes it a lot fast restart on
## Jackson binds data to @RequestBody
##  Versioning API
### Major (Breaking change)-- Which is going to break existing functionality e.g. adding a new required parameter or changing request body or chenging a date format
### Minor (Non Breaking change)-- Which is not going to break the existing functionality
## @Deprecated // inform api consumers for deprecation
## Excellent Branching stratgy https://github.com/lyndseypadget/semflow
## @GetMapping, @PostMapping and others are the extension of @RequestMapping
## Http2
## SpringDataRest
## Read MapStruct documentation
## install decompiler in eclipse
## Mapstruct converts to and from data types and also enums
## BOM Bill of material
## Some of Autitors PCI Compliance, SOX, SAS70
## show effective pom
## group id and artifact id is called co-ordinates
## Find more about maven-enforcer-plugin
## how to push artifacts in maven central --> research
## Java Database Connectivity (JDBC) this is a standard
## Permanent database -> Data base server is oracle
## Managed server -> is like AWS data base
## H2Database https://h2database.com/html/features.html -- it has a compatibliry mode with mysql and other database
## Always use validate in schema so that it validates the entity against schema and it will fail to restart.
## the maximum number of connections allowed by database server shoulb be proponate e.g. mysql defaults to 151 connection so if i am using 2 instance then max allowed connection should be 75, if 3 then 50 per instance
## HickariCP https://github.com/brettwooldridge/HikariCP
## HickariCP MySQL connection https://github.com/brettwooldridge/HikariCP/wiki/MySQL-Configuration
