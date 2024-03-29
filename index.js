// function to parse url
function parseUrl(url) {
    const parsedUrl = new URL(url);
    const protocol = parsedUrl.protocol;
    const hostname = parsedUrl.hostname;
    const port = parsedUrl.port;
    const path = parsedUrl.pathname;
    const searchParams = parsedUrl.searchParams;

    return {
        protocol,
        hostname,
        port,
        path,
        searchParams,
    };
}
![nudge comment](./images/cdd3.png?raw=true "nudge comment")
// example usage
const url = "https://www.example.com:8080/path?param1=value1&param2=value2";
const parsedUrl = parseUrl(url);
console.log(parsedUrl);
```
