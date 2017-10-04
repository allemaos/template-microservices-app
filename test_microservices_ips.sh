#!/bin/zsh


echo '==========Client ================'
curl http://localhost:7071/health

echo '====== Edge Server (gateway) ====='
curl http://localhost:7070/health

echo '====== Hystrix Dashboard ========='
curl http://localhost:7061/health

echo '========= Turbine ==============='
curl http://localhost:7062/health

echo '========= Product ==============='
curl http://localhost:9090/health

echo '======= Discovery Service ========'
curl http://localhost:8761/health

echo '========== Book ================'
curl http://localhost:8090/health

