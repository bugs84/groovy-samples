package samples
class XmlExamplesCl {
    static def CAR_RECORDS = '''
    <records>
      <car name='HSV Maloo' make='Holden' year='2006'>
        <country>Australia</country>
        <countries type='speed'>Production Pickup Truck with speed of 271kph</countries>
      </car>
      <car name='P50' make='Peel' year='1962'>
        <country>Isle of Man</country>
        <countries type='size'>Smallest Street-Legal Car at 99cm wide and 59 kg in weight</countries>
      </car>
      <car name='Royale' make='Bugatti' year='1931'>
        <country>France</country>
        <countries type='price'>Most Valuable Car at $15 million</countries>
      </car>
    </records>
  '''
}

//Parse
def rootNode = new XmlParser().parseText(XmlExamplesCl.CAR_RECORDS)

//Select
println rootNode.car[0].attributes()
println rootNode.car[0].'@year'

//findAllSearch all direct childrens
def cars = rootNode.findAll {it.name() == 'car'}
println cars.size()

//breadthFirst() or depthFirst() find
def countries = rootNode.depthFirst().grep {it.name() == 'country'}
countries.each {print it.text() + ", "}
String
println ""

//addNode
rootNode.append(new Node(null, "MyNode1", "Node Value 1 - null if nothing"))
new Node(rootNode, "MyNode2", "Node Value 2 - null if nothing")

//Write modified xml
def writer = new StringWriter()
new XmlNodePrinter(new PrintWriter(writer)).print(rootNode)
def modifiedXml = writer.toString()
println modifiedXml

