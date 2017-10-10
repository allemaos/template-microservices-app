#!/bin/zsh


echo '==========Client ================ '
curl http://localhost:8070/health
echo '\n'
echo '====== Edge Server (gateway) ===== '
curl http://localhost:7070/health
echo '\n'

echo '====== Hystrix Dashboard ========= '
curl http://localhost:7002/health
echo '\n'

echo '========= Turbine =============== '
curl http://localhost:7003/health
echo '\n'

echo '========= Product =============== '
curl http://localhost:7072/health
echo '\n'

echo '========== Book ================ '
curl http://localhost:8080/health
echo '\n'

echo '======= Discovery Service ======== '
curl http://localhost:8761/health
echo '\n'

