#!/bin/bash

service mysqld start

#set root password
OLDPWD=`sudo grep 'temporary password' /var/log/mysqld.log | awk '{print $11}'`

mysqladmin -u root --password=$OLDPWD password $RootPassword
