package tmp.tmp

String ticketId = "256"
String url = "http://google.com"

String req = '''<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns="http://www.trask.cz/2012/HUB/MWFGL3/001/">
   <soapenv:Header>
      <ns:requestTifMessageHeaderElement>
         <ns:ServiceId>?</ns:ServiceId>
         <ns:ServiceVersion>?</ns:ServiceVersion>
         <ns:ReplyPersistance>?</ns:ReplyPersistance>
         <ns:ReplyExpiry>?</ns:ReplyExpiry>
         <ns:UserIdL2>?</ns:UserIdL2>
         <ns:UserIdL3>?</ns:UserIdL3>
         <ns:RequestSystemId>?</ns:RequestSystemId>
         <ns:RequestApplId>?</ns:RequestApplId>
         <ns:ReplyApplId>?</ns:ReplyApplId>
         <ns:FrontendApplId>?</ns:FrontendApplId>
         <ns:FrontendSystemId>?</ns:FrontendSystemId>
         <ns:RequestDate>?</ns:RequestDate>
         <ns:RequestTime>?</ns:RequestTime>
         <ns:RoundtripTimeout>?</ns:RoundtripTimeout>
      </ns:requestTifMessageHeaderElement>
   </soapenv:Header>
   <soapenv:Body>
      <ns:MWFGL3RequestElement>
         <ns:TicketID>'''+ticketId+'''</ns:TicketID>
         <ns:URL>'''+url+'''</ns:URL>
      </ns:MWFGL3RequestElement>
   </soapenv:Body>
</soapenv:Envelope>''';

println req;




