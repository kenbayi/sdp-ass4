> [!NOTE]
> At the end of this documentation, there is a tree of src directory of this project. It will help to you to coordinate.

### Strategy Pattern
The Strategy Pattern lets you choose different ways to perform a task at runtime. For example, in a payment system, you can switch between paying with a credit card, PayPal, or cryptocurrency. This makes the system flexible and easy to extend with new payment methods.

### Observer Pattern
The Observer Pattern allows objects (observers) to receive updates when something changes in another object (subject). In a weather monitoring system, various displays (observers) update automatically when the weather station (subject) changes its data. This helps keep all displays synchronized without needing to constantly check for updates.

### Command Pattern
The Command Pattern turns a request into a stand-alone object, making it easier to manage actions, like undoing or queuing them. In a smart home remote control, each button can be a command, like turning on the TV or dimming the lights. This pattern helps with organizing actions and adding features like an undo button.

### State Pattern
The State Pattern allows an object to change its behavior based on its current state. In an order processing system, an order can be in different states like "New," "Paid," or "Shipped," and each state will behave differently (e.g., you can't ship an order unless it's paid). This pattern makes the code easier to manage by keeping state-specific logic separate.

### Chain of Responsibility Pattern
The Chain of Responsibility Pattern passes a request along a chain of handlers until one can handle it. In an expense approval system, requests are sent up the chain from a team lead to a manager, director, and then the CEO, depending on the amount. This pattern helps avoid tightly coupling request senders with their handlers.

### Mediator Pattern
The Mediator Pattern simplifies communication between objects by using a mediator to handle interactions. In a chat room, users send messages to the mediator (chat room), which then sends the messages to the appropriate users. This pattern reduces the direct dependencies between objects, making the system more maintainable.

### Memento Pattern
The Memento Pattern captures and restores an object's state without exposing its details. In a document version control system, you can save and restore different versions of a document using mementos. This pattern is useful for undo functionality or restoring previous states.

### Visitor Pattern
The Visitor Pattern lets you add operations to objects without changing their structure. In a shape area calculator, each shape accepts a visitor that performs calculations, like finding the area of a circle or rectangle. This makes it easy to add new operations without altering the shapes themselves.

### Template Method Pattern
The Template Method Pattern defines the steps of an algorithm, allowing subclasses to fill in the details. In a report generation system, different report formats like PDF or HTML follow the same overall process but customize how the header, body, and footer are created. This pattern ensures consistency while allowing flexibility.

### Iterator Pattern
The Iterator Pattern provides a way to sequentially access elements in a collection without exposing its underlying structure. In a playlist management system, different iterators allow you to play songs in order, shuffle them, or filter by genre. This pattern makes it easy to navigate through collections in different ways.

```bash
src
├── chainofresponsibilityPattern
│   ├── ApprovalChain.java
│   ├── Approver.java
│   ├── ExpenseRequest.java
│   ├── Main.java
│   ├── Manager.java
│   └── TeamLead.java
├── commandPattern
│   ├── Command.java
│   ├── DimLights.java
│   ├── Light.java
│   ├── Main.java
│   ├── RemoteControl.java
│   ├── TV.java
│   └── TurnTVOn.java
├── iteratorPattern
│   ├── Iterator.java
│   ├── Main.java
│   ├── Playlist.java
│   ├── SequentialIterator.java
│   ├── ShuffleIterator.java
│   └── Song.java
├── mediatorPattern
│   ├── ChatMediator.java
│   ├── ChatRoom.java
│   ├── ChatUser.java
│   ├── Main.java
│   └── User.java
├── mementoPattern
│   ├── Document.java
│   ├── DocumentVersion.java
│   ├── Main.java
│   └── VersionControl.java
├── observerPattern
│   ├── CurrentConditionsDisplay.java
│   ├── Main.java
│   ├── StatisticsDisplay.java
│   ├── WeatherDisplay.java
│   └── WeatherStation.java
├── statePattern
│   ├── CancelledOrderState.java
│   ├── DeliveredOrderState.java
│   ├── Main.java
│   ├── NewOrderState.java
│   ├── Order.java
│   ├── PaidOrderState.java
│   ├── ShippedOrderState.java
│   └── State.java
├── strategyPattern
│   ├── CreditCardPayment.java
│   ├── Main.java
│   ├── PayPalPayment.java
│   ├── PaymentStrategy.java
│   └── ShoppingCart.java
├── templateMethodPattern
│   ├── HTMLReportGenerator.java
│   ├── Main.java
│   ├── PDFReportGenerator.java
│   └── ReportGenerator.java
└── visitorPattern
    ├── AreaCalculator.java
    ├── Circle.java
    ├── Drawing.java
    ├── Main.java
    ├── Rectangle.java
    ├── Shape.java
    └── Visitor.java
```