#Set up for Selenium Grid:


Download  Selenium Server (Grid) jar file.
    Open link:  https://www.selenium.dev/downloads/
    Click Latest stable version 3.141.59

    Note: jar version might be different. Always try latest one and use same in below commands


Open terminal and go to the path where above jar is downloaded.
    e.g. if it’s downloaded in ‘Downloads’ folder, write command: cd Downloads


Run below command over same path to set up hub:
  java -jar selenium-server-standalone-3.141.59.jar -role hub

  If get any error, like: Port 4444 is busy
    then run command to check the process on this port: sudo lsof -i :4444
    then kill the process, command: kill -9 <process id from above command>
    Now we can same command again.


Open http://localhost:4444/ or http://127.0.0.1:4444/
    You should be able to see the console


Find out hub’s IP Address: it will be useful in Node set up:
    command: ifconfig | grep -i 'inet 10'
	it will give like:
			inet 10.133.20.56 netmask 0xfffffc00 broadcast 10.133.23.255
			inet 10.96.23.72 netmask 0xffffffff broadcast 10.96.23.72

    Your hub’s IP is:  10.133.20.56


Set up node:  (can set up more than 1 node also)
    Run below command on node machine on path, where driver like chromedriver is stored:
    java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://10.133.20.56:4444/grid/register -port 5555
