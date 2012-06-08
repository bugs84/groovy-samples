package samples

//Parse
def path = /c:\connect_install8.1\config\production\ConnectProductionService.xml/
def rootNode = new XmlParser().parse(path)
def enabledNode = rootNode.depthFirst().grep {
    it.name() == 'Enabled' && it.parent().name() == 'VCSConnectionSettings'


}
boolean isEnabled = Boolean.parseBoolean(enabledNode[0].'@value')
enabledNode[0].'@value' = !isEnabled
int i = 0

//Write modified xml
def writer = new FileWriter(path)
new XmlNodePrinter(new PrintWriter(writer)).print(rootNode)
//def modifiedXml = writer.toString()
//println modifiedXml
System.out.println("Changed from " + isEnabled + " to " + !isEnabled);

//
//
////Select
//println rootNode.car[0].attributes()
//println rootNode.car[0].'@year'
//
////findAllSearch all direct childrens
//def cars = rootNode.findAll {it.name() == 'car'}
//println cars.size()
//
////breadthFirst() or depthFirst() find
//def countries = rootNode.depthFirst().grep {it.name() == 'country'}
//countries.each {print it.text() + ", "}
//String
//println ""
//
////addNode
//rootNode.append(new Node(null, "MyNode1", "Node Value 1 - null if nothing"))
//new Node(rootNode, "MyNode2", "Node Value 2 - null if nothing")
//
////Write modified xml
//def writer = new StringWriter()
//new XmlNodePrinter(new PrintWriter(writer)).print(rootNode)
//def modifiedXml = writer.toString()
//println modifiedXml
//
