package example.conference.registrations;

public class OrderConfirmed {

    private String orderId;

    public OrderConfirmed(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderConfirmed that = (OrderConfirmed) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return orderId != null ? orderId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrderConfirmed{" +
                "orderId='" + orderId + '\'' +
                '}';
    }

    protected OrderConfirmed() {
    }
}
