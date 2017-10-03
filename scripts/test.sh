#echo off                                                                       
export workspace=/home/david/hlocal/eclipse-workspace/david.blas.SVC.miw.upm.es                        
echo -----------------------------------------
echo ".(C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
cd $workspace
echo "============ mvn clean test (profile: develop) ==========================\
============================="
echo .
mvn clean test
exit

