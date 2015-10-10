#问题单

##1、address already in use

1、执行sudo netstat -apn | grep 4040

>tcp6 0 0 :::4040 :::* LISTEN 25323/java 

2、执行sudo kill -9 25323
