import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintJobTest {

    @Test
    @DisplayName("Count buckets of paint")
    void getBucketCountTest() {
        assertAll(() -> assertEquals(-1, PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2)),
                () -> assertEquals(2, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2)),
                () -> assertEquals(3, PaintJob.getBucketCount(2.75, 3.25, 2.5, 1)),
                () -> assertEquals(-1, PaintJob.getBucketCount(3.4, -2.1, 1.5, 0)));
    }
}
