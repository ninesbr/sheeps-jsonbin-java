.PHONY:  install proto-go proto-java

proto-go:
	@protoc --proto_path=proto proto/*.proto --go_out=plugins=grpc:pkg/grpc/pb

proto-java:
	@mvn clean generate-sources

install:
	@mvn clean generate-sources compile install


