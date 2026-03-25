package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Ticket;
import static org.junit.jupiter.api.Assertions.*;

public class TicketFactoryTest {

    @Test
    public void testCreateTicket() {
        Ticket ticket = TicketFactory.createTicket(
        "B001",
        "VIP",
        150.0,
        "A12"
     );

        assertNotNull(ticket);
        assertNotNull(ticket.getTicketId());
        assertEquals("B001", ticket.getBookingId());
        assertEquals("VIP", ticket.getTicketType());
        assertEquals(150.0, ticket.getPrice());
        assertEquals("A12", ticket.getSeatNumber());
    }

    @Test
    public void testCreateTicketFail() {
        Ticket ticket = TicketFactory.createTicket(
                "",
                "VIP",
                150.0,
                "A12"
        );

        assertNull(ticket);

    }

}
