package ninja.bryansills.buttz

import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

class MainTest {
    lateinit var component: AlphaComponent

    @Before
    fun setup() {
        component = DaggerAlphaComponent.builder()
            .alphaModule(AlphaModule("BIG"))
            .betaComponent(DaggerBetaComponent.builder()
                .betaModule(BetaModule("FAT"))
                .charlieComponent(DaggerCharlieComponent.builder()
                    .charlieModule(CharlieModule("BUTTZ"))
                    .build())
                .build())
            .build()
    }

    @Test
    fun mainTest() {
        assertTrue { component.alphaData().alphaString == "BIG" }
    }

    @Test
    fun secondTest() {
        assertTrue { component.alphaData().betaString == "FAT" }
    }

    @Test
    fun thirdTest() {
        assertTrue { component.alphaData().charlieString == "BUTTZ" }
    }
}