package ninja.bryansills.buttz

import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

class TestComponentTest {
    lateinit var component: TestAlphaComponent

    @Before
    fun setup() {
        component = DaggerTestAlphaComponent.builder()
            .alphaModule(AlphaModule("LARGE"))
            .fakeBetaComponent(DaggerFakeBetaComponent.builder()
                .fakeBetaModule(FakeBetaModule("GIRTHY", "POSTERIOR"))
                .build())
            .build()
    }

    @Test
    fun mainTest() {
        assertTrue { component.alphaData().alphaString == "LARGE" }
    }

    @Test
    fun secondTest() {
        assertTrue { component.alphaData().betaString == "GIRTHY" }
    }

    @Test
    fun thirdTest() {
        assertTrue { component.alphaData().charlieString == "POSTERIOR" }
    }
}