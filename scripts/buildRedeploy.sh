#!/bin/sh

echo "************ UNDEPLOYING *******************"
asadmin undeploy EventDay
echo "************ BUILDING **********************"
mvn package
echo "************ DEPLOYING *********************"
asadmin deploy target/EventDay.war
