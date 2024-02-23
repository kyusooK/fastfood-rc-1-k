package fastfood.store.service;

import fastfood.store.events.OrderPlaced;
import fastfood.store.repository.StoreRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.function.StreamBridge;

import static org.mockito.Mockito.verify;

@SpringBootTest
class StoreServiceTest {

    @Mock
    private StoreRepository storeRepository;

    @Mock
    private StreamBridge streamBridge;

    @InjectMocks
    private StoreService storeService;

    // @Test
    // void testWheneverOrderPlaced_AcceptOrder() {
    //     OrderPlaced event = new OrderPlaced();
    //     // Populate the event with test data

    //     storeService.wheneverOrderPlaced_AcceptOrder().accept(event);

    //     // Verify the interactions or state changes expected
    // }

    // Additional tests for other events and scenarios
}