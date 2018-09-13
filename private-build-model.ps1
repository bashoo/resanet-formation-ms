## Laisser cette ligne
If (Test-Path .\work){Remove-Item .\work -Force -Recurse}

mvn -f ./pom.xml clean install
