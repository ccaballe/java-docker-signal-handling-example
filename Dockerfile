FROM java:8-jdk
ADD App.java /
RUN javac App.java
CMD ["/usr/bin/java", "App"]
