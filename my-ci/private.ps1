## Laisser cette ligne
If (Test-Path .\work){Remove-Item .\work -Force -Recurse}
git clone https://github.com/bashoo/resanet-formation-ms.git work
mvn -f ./work/pom.xml clean install
