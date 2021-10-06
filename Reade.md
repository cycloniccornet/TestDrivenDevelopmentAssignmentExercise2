#Reflections

##Computer Mouse
To test a standard computer mouse i would test the following pointers

• Each compontent indiviually.\
This ensures that we furture fail prof each part or atleast know weak points when its put together\

• Testing the sensors reaction time\
It is known that diffrent mice have diffrent speeds on the sensor. This will show the lag and can me done with a fast speed camara\

• Stress test the mouse\
This will check the components over time and can either be done with a robot or a child, high on caffine.

![Mouse](Mouse.jpg)


##Catastrophic Failure
For my exam in 4.sem of Datamatiker we made a big webpage for the exam project. A simple webpage with 4 diffrent Crud operations and a chat service

The day before the exam we finished some "problems" and everyting seemed to be working fine. We did a small smoke test and then we were good to go.
The day after i realised testing has value.\
It look good until you accualy needed the functions. Everything broke and half of the methods didnt do its job correctly.\
To combat this we could have written... well any test so we automatically could test all the previous written code. A simple unittest would do it.


#Investigation of tools
##JUnit 5
3.1 - JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

• @Tag

Bruges til at kunne filtrere tests, hvis man vil køre en række klasse eller metode tests afhængig af det man vil teste - hvor der måske er en række klasser som hænger sammen - eller i modsatte tilfælde hvor man kun vil køre nogle enkelte metode tests i en klasse.

• @Disabled

Bruges til at deaktivere en klasse eller metode test. Kunne være brugbart hvis man har nogle deaktiverede funktion i et program som man senere gerne vil benytte.

• @RepeatedTest

En måde at køre den samme test et bestemt antal gange. Kan være nyttig hvis man har en test, hvor man har nogle parametre som kan variere fra gang til gang.

• @BeforeEach, @AfterEach

En annotation til at markerer at en metode skal køre før eller efter en given test. Kan bruges til at ændre noget data som en test er afhængig af.

• @BeforeAll, @AfterAll

Som overstående, bare hvor man kun annoterer at denne metode skal køres en enkelt gang, hvorimod den overstående @BeforeEach/@AfterEach bliver kørt hver gang.

• @DisplayName

En annotation som giver mulighed for at give test metoden et bestemt navn, så man nemmere kan finde den eller bedre kan forklare præcis hvad testen gør.

• @Nested

Annoterer at denne testklasse er en ikke statisk indlejret klasse. Giver mulighed for at have en eller flere indre klasser i en klasse, som dermed vil have samme initialisering som hovedklassen.

• assumeFalse, assumeTrue

Giver mulighed for at lave en "test" inde i testen, hvor man forventer at noget enten er sandt eller falsk. Hvis dette ikke passer, vil testen stoppe. Kan bruges hvis man har en test hvor der er et krav om at en variable eller et statement enten er sandt eller falsk før man kan teste det man vil teste.


##Mockito vs EasyMock

###Similarities

Both EasyMock and Mockito are open-source, java-based frameworks.\
Both are typically used along with other test, like JUnit or TestNG\
Both follow Record-Replay-Verify patterns.

###Diffrences

**Mockito**
    Mockito uses @Mock and @InjectMocks annotations.\
    @Mock creates a for a class\
    @InjectMocks the annotated object into the object annotated with @Mock

**EasyMock**
    EasyMock uses @Mock and @TestSubject\
    @Mock creates a for a class\
    @TestSubject the annotated object into the object annotated with @Mock\

**EasyMock** also requires you to use **EasyMock**.replay(mock) on every method testet.


###Applying to login system
###Setup
**Mockito**

    public class LoginControllerTest {
    
        @Mock
        private LoginDao loginDao;
    
        @Mock
        private LoginService loginService;
    
        @InjectMocks
        private LoginController loginController;
    }


**EasyMock**

    @RunWith(EasyMockRunner.class)
    public class LoginControllerTest {
    
        @Mock
        private LoginDao loginDao;
    
        @Mock
        private LoginService loginService;
    
        @TestSubject
        private LoginController loginController = new LoginController();
    }

###Testing that no calls is made before testing
 
**Mockito**              
              
    @Test
    public void assertThatNoMethodHasBeenCalled() {
        loginController.login(null);
        Mockito.verifyZeroInteractions(loginService);
    }          
    
    
**EasyMock**
                                                
    @Test
    public void assertThatNoMethodHasBeenCalled() {
        EasyMock.replay(loginService);
        loginController.login(null);
        EasyMock.verify(loginService);
    }

###Which Do i Prefer
I prefer mochito beacuse its easyer to swallow 😏😉.
Jokes a side, i like the syntax better. It resembles more the syntax im used to from spring boot and 
EasyMock requires you to EasyMock.replay EasyMock.verify every god damn time...\\

To put it simply\\\
![Monopoli](Monoploi.png) 