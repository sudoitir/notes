# Set the DNS server for IntelliJ IDEA

**Modify the "idea.properties" file. Here are the steps:**

1. Open IntelliJ IDEA and go to "Help" > "Edit Custom Properties".
2. If the file "idea.properties" doesn't exist, create a new one.
3. Add the following line to the file, replacing "dns_server_ip_address" with the IP address of your preferred DNS server:

```
# custom IntelliJ IDEA properties (expand/override 'bin/idea.properties')
networkaddress.cache.ttl=60
networkaddress.cache.negative.ttl=10
sun.net.inetaddr.ttl=30
sun.net.inetaddr.negative.ttl=0
sun.net.inetaddr.negative.timeout=0
sun.net.inetaddr.isReachableCacheDuration=0
sun.net.inetaddr.maxFailedAttempts=0
sun.net.inetaddr.dnsResolver=dns_server_ip_address_1,dns_server_ip_address_2,!127.0.0.1
```

```
DNS-over-TLS:
sun.net.inetaddr.dnsResolver=tls://dns.example.com

DNS-over-HTTPS:
sun.net.inetaddr.dnsResolver=https://dns.example.com/dns-query
```
