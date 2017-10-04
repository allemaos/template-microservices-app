#!/bin/zsh


echo '==========Client ================'
curl http://localhost:8070/health

echo '====== Edge Server (gateway) ====='
curl http://localhost:7070/health

echo '====== Hystrix Dashboard ========='
curl http://localhost:7002/health

echo '========= Turbine ==============='
curl http://localhost:7003/health

echo '========= Product ==============='
curl http://localhost:7072/health

echo '======= Discovery Service ========'
curl http://localhost:8761/health

echo '========== Book ================'
curl http://localhost:7073/health

