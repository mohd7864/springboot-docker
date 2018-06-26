# springboot-docker
Springboot with Docker

dockerd -H tcp://127.0.0.1:2375 &

docker run -p 8080:9080 -t  springbootdemo --name springbootdemo-docker

docker tag  <ContainerId> hubname/reponame

docker push hubname/reponame
