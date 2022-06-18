import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.transform.stream.StreamSource;

/*

 Инструменты
 <PowerTools>
    <model> Name </model>
    <Handy> одно- или двуручное </Handy>
    <Origin> Страна Производитель</Origin>
    <TS>
        <UseEnergy> (низкое, среднее, высокое </UseEnergy>
        <Perfomance> Ten </Perfomance>
    </TS>
    <material>    </material>
 </PowerTools>

* */

public class laba_17 {
    public static void main(String[] args) {
        // Create class /// String model, String handy, String origin, String UseEnergy, int Perfomance
        PowerTools ps = new PowerTools("Svarka", "one_handy", "Belarus", "Medium", "Ten");

        /// Как Улучшение можно сделать Класс и метод который будет выбирать кол-во Node и их содержимое
        /* START ======================================================================================== Create And append Data in *.xml */
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try
        {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        } // forming a document tree

        // Document
        Document document = documentBuilder.newDocument();

        // root
        String root = "PowerTools";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);

        // model
        Element elementName = document.createElement("model");
        String name = ps.getModel();
        elementName.appendChild(document.createTextNode(name));

        // handy
        Element elementHandy = document.createElement("handy");
        String handy = ps.getHandy();
        elementHandy.appendChild(document.createTextNode(handy));
        //elementHandy.setAttribute("id", "777");

        // Origin
        Element elementOrigin = document.createElement("origin");
        String Origin = ps.getOrigin();
        elementOrigin.appendChild(document.createTextNode(Origin));

        // TS
        Element elementTS = document.createElement("ts");
        // child elements TS - UseAnergy, Perfomance
        Element elementUseAnergy =  document.createElement("UseAnergy");
        String UseEnergy = ps.getUseEnergy();
        elementUseAnergy.appendChild(document.createTextNode(UseEnergy));
        Element elementPerfomance =  document.createElement("Perfomance");
        String Perfomance = ps.getPerfomance();
        elementPerfomance.appendChild(document.createTextNode(Perfomance));

        // append child TS
        elementTS.appendChild(elementUseAnergy);
        elementTS.appendChild(elementPerfomance);

        // Material
        Element elementMaterial = document.createElement("material");
        String material = "Metal";
        elementMaterial.appendChild(document.createTextNode(material));

        // write tree to file
        rootElement.appendChild(elementName);
        rootElement.appendChild(elementHandy);
        rootElement.appendChild(elementOrigin);
        rootElement.appendChild(elementTS);
        rootElement.appendChild(elementMaterial);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try
        {
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileWriter("PowerTools.xml"));
            transformer.transform(source, result);
        }
        catch (TransformerConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (TransformerException | IOException e)
        {
            e.printStackTrace();
        }
        /* END ======================================================================================== Create And append Data in *.xml */

        try
        {
            TransformerFactory tFact = TransformerFactory.newInstance();
            Transformer transformer = tFact.newTransformer(new StreamSource("PowerTools.xsl"));
            transformer.transform(new StreamSource("PowerTools.xml"), new StreamResult("PowerTools.html"));
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
        }
    }
}

