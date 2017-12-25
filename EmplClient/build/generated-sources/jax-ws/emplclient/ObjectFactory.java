
package emplclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the emplclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddNewPizzaResponse_QNAME = new QName("http://MyWS/", "addNewPizzaResponse");
    private final static QName _ChangeOrderStatusResponse_QNAME = new QName("http://MyWS/", "changeOrderStatusResponse");
    private final static QName _AddNewPizza_QNAME = new QName("http://MyWS/", "addNewPizza");
    private final static QName _GetPizzaList_QNAME = new QName("http://MyWS/", "getPizzaList");
    private final static QName _RemovePizzaResponse_QNAME = new QName("http://MyWS/", "removePizzaResponse");
    private final static QName _AddNewOrder_QNAME = new QName("http://MyWS/", "addNewOrder");
    private final static QName _GetPizzaListResponse_QNAME = new QName("http://MyWS/", "getPizzaListResponse");
    private final static QName _RemovePizza_QNAME = new QName("http://MyWS/", "removePizza");
    private final static QName _ChangeOrderStatus_QNAME = new QName("http://MyWS/", "changeOrderStatus");
    private final static QName _CheckOrderStatus_QNAME = new QName("http://MyWS/", "checkOrderStatus");
    private final static QName _CheckOrderStatusResponse_QNAME = new QName("http://MyWS/", "checkOrderStatusResponse");
    private final static QName _AddNewOrderResponse_QNAME = new QName("http://MyWS/", "addNewOrderResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://MyWS/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://MyWS/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: emplclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNewPizza }
     * 
     */
    public AddNewPizza createAddNewPizza() {
        return new AddNewPizza();
    }

    /**
     * Create an instance of {@link ChangeOrderStatusResponse }
     * 
     */
    public ChangeOrderStatusResponse createChangeOrderStatusResponse() {
        return new ChangeOrderStatusResponse();
    }

    /**
     * Create an instance of {@link AddNewPizzaResponse }
     * 
     */
    public AddNewPizzaResponse createAddNewPizzaResponse() {
        return new AddNewPizzaResponse();
    }

    /**
     * Create an instance of {@link RemovePizzaResponse }
     * 
     */
    public RemovePizzaResponse createRemovePizzaResponse() {
        return new RemovePizzaResponse();
    }

    /**
     * Create an instance of {@link GetPizzaList }
     * 
     */
    public GetPizzaList createGetPizzaList() {
        return new GetPizzaList();
    }

    /**
     * Create an instance of {@link AddNewOrder }
     * 
     */
    public AddNewOrder createAddNewOrder() {
        return new AddNewOrder();
    }

    /**
     * Create an instance of {@link GetPizzaListResponse }
     * 
     */
    public GetPizzaListResponse createGetPizzaListResponse() {
        return new GetPizzaListResponse();
    }

    /**
     * Create an instance of {@link RemovePizza }
     * 
     */
    public RemovePizza createRemovePizza() {
        return new RemovePizza();
    }

    /**
     * Create an instance of {@link CheckOrderStatus }
     * 
     */
    public CheckOrderStatus createCheckOrderStatus() {
        return new CheckOrderStatus();
    }

    /**
     * Create an instance of {@link ChangeOrderStatus }
     * 
     */
    public ChangeOrderStatus createChangeOrderStatus() {
        return new ChangeOrderStatus();
    }

    /**
     * Create an instance of {@link AddNewOrderResponse }
     * 
     */
    public AddNewOrderResponse createAddNewOrderResponse() {
        return new AddNewOrderResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CheckOrderStatusResponse }
     * 
     */
    public CheckOrderStatusResponse createCheckOrderStatusResponse() {
        return new CheckOrderStatusResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewPizzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "addNewPizzaResponse")
    public JAXBElement<AddNewPizzaResponse> createAddNewPizzaResponse(AddNewPizzaResponse value) {
        return new JAXBElement<AddNewPizzaResponse>(_AddNewPizzaResponse_QNAME, AddNewPizzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "changeOrderStatusResponse")
    public JAXBElement<ChangeOrderStatusResponse> createChangeOrderStatusResponse(ChangeOrderStatusResponse value) {
        return new JAXBElement<ChangeOrderStatusResponse>(_ChangeOrderStatusResponse_QNAME, ChangeOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewPizza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "addNewPizza")
    public JAXBElement<AddNewPizza> createAddNewPizza(AddNewPizza value) {
        return new JAXBElement<AddNewPizza>(_AddNewPizza_QNAME, AddNewPizza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPizzaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "getPizzaList")
    public JAXBElement<GetPizzaList> createGetPizzaList(GetPizzaList value) {
        return new JAXBElement<GetPizzaList>(_GetPizzaList_QNAME, GetPizzaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePizzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "removePizzaResponse")
    public JAXBElement<RemovePizzaResponse> createRemovePizzaResponse(RemovePizzaResponse value) {
        return new JAXBElement<RemovePizzaResponse>(_RemovePizzaResponse_QNAME, RemovePizzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "addNewOrder")
    public JAXBElement<AddNewOrder> createAddNewOrder(AddNewOrder value) {
        return new JAXBElement<AddNewOrder>(_AddNewOrder_QNAME, AddNewOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPizzaListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "getPizzaListResponse")
    public JAXBElement<GetPizzaListResponse> createGetPizzaListResponse(GetPizzaListResponse value) {
        return new JAXBElement<GetPizzaListResponse>(_GetPizzaListResponse_QNAME, GetPizzaListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePizza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "removePizza")
    public JAXBElement<RemovePizza> createRemovePizza(RemovePizza value) {
        return new JAXBElement<RemovePizza>(_RemovePizza_QNAME, RemovePizza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "changeOrderStatus")
    public JAXBElement<ChangeOrderStatus> createChangeOrderStatus(ChangeOrderStatus value) {
        return new JAXBElement<ChangeOrderStatus>(_ChangeOrderStatus_QNAME, ChangeOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "checkOrderStatus")
    public JAXBElement<CheckOrderStatus> createCheckOrderStatus(CheckOrderStatus value) {
        return new JAXBElement<CheckOrderStatus>(_CheckOrderStatus_QNAME, CheckOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOrderStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "checkOrderStatusResponse")
    public JAXBElement<CheckOrderStatusResponse> createCheckOrderStatusResponse(CheckOrderStatusResponse value) {
        return new JAXBElement<CheckOrderStatusResponse>(_CheckOrderStatusResponse_QNAME, CheckOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "addNewOrderResponse")
    public JAXBElement<AddNewOrderResponse> createAddNewOrderResponse(AddNewOrderResponse value) {
        return new JAXBElement<AddNewOrderResponse>(_AddNewOrderResponse_QNAME, AddNewOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWS/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
