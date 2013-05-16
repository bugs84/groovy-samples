package tmp.tmp

def ticketId = 256
def url = "http://www.google.com"


private Properties loadProperties() {
    def pathToFile = "d:/My Dropbox/Groovy/GroovyScripts/src/tmp/tmp/service.properties"
    def props = new Properties()
    new File(pathToFile).withInputStream {
        stream -> props.load(stream)
    }
    props
}


private String prepareSoapRequest(Properties props, String ticketId, String url) {
    def req = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"http://www.trask.cz/2012/HUB/MWFGL3/001/\">\n" +
            "    <soapenv:Header>\n" +
            "        <ns:requestTifMessageHeaderElement>\n" +
            "            <ns:ServiceId>${props["ServiceId"]}</ns:ServiceId>\n" +
            "            <ns:ServiceVersion>${props["ServiceVersion"]}</ns:ServiceVersion>\n" +
            "            <ns:ReplyExpiry>${props["ReplyExpiry"]}</ns:ReplyExpiry>\n" +
            "            <ns:UserIdL2>${props["UserIdL2"]}</ns:UserIdL2>\n" +
            "            <ns:UserIdL3>${props["UserIdL3"]}</ns:UserIdL3>\n" +
            "            <ns:RequestSystemId>${props["RequestSystemId"]}</ns:RequestSystemId>\n" +
            "            <ns:RequestApplId>${props["RequestApplId"]}</ns:RequestApplId>\n" +
            "            <ns:ReplyApplId>${props["ReplyApplId"]}</ns:ReplyApplId>\n" +
            "            <ns:FrontendApplId>${props["FrontendApplId"]}</ns:FrontendApplId>\n" +
            "            <ns:FrontendSystemId>${props["FrontendSystemId"]}</ns:FrontendSystemId>\n" +
            "            <ns:RequestDate>${props["RequestDate"]}</ns:RequestDate>\n" +
            "            <ns:RequestTime>${props["RequestTime"]}</ns:RequestTime>\n" +
            "            <ns:RoundtripTimeout>${props["RoundtripTimeout"]}</ns:RoundtripTimeout>\n" +
            "        </ns:requestTifMessageHeaderElement>\n" +
            "    </soapenv:Header>\n" +
            "    <soapenv:Body>\n" +
            "        <ns:MWFGL3RequestElement>\n" +
            "            <ns:TicketID>${ticketId}</ns:TicketID>\n" +
            "            <ns:URL>${url}</ns:URL>\n" +
            "        </ns:MWFGL3RequestElement>\n" +
            "    </soapenv:Body>\n" +
            "</soapenv:Envelope>"
    return req;
}


Properties props = loadProperties()
def req = prepareSoapRequest(props, ticketId.toString(), url)

println req








