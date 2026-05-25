.PHONY: build run clean

build:
	mvn clean package

run:
	docker build -t java-war .
	docker run -p 8080:8080 --rm java-war

clean:
	mvn clean
	-docker rmi java-war 2>/dev/null || true
