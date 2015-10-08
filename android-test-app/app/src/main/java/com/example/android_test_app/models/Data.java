package com.example.android_test_app.models;

import com.example.android_test_app.R;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Article> getSportArticles() {
        List<Article> articles = new ArrayList<>();

        Article article1 = new Article(
                R.drawable.henrik_larsson,
                "Barça drömmer – om en ny Henke Larsson",
                "Det blåser kring FC Barcelona. Lösningen? Svenskinfluerad. Enligt Sport jobbar klubben med Operación Nuevo Larsson.",
                "Barcelona har hackat i inledningen av säsongen, och fortsatt att göra precis det när Lionel Messi\n" +
                "   och Andres Iniesta är borta skadade. Kombinera det med klubbens transferförbud – vilket gör att sommarens\n" +
                "   nyförvärv får spela först från och med januari – så finns en genuin oro över var årets säsong är på väg.\n" +
                "   Lösningen heter ”Operation Ny Larsson”. Uppgifterna pryder Barcelona-baserade tidningen Sports förstasida i\n" +
                "   dag och handlar om att den katalanska klubben – och tekniske direktören Roberto Fernandez – letar efter ”en\n" +
                "   ny Henrik Larsson”.\n" +
                "   Inte för dyr\n" +
                "   Det är inte första gången som Barcelona drömmer sig tillbaka till när den svenske anfallaren spelade i\n" +
                "   klubben. Med ”en ny Henrik Larsson” menas att klubben letar efter en spelare som ”redan är veteran,\n" +
                "   rutinerad på den internationella scenen och som kan leverera direkt efter att han anländer till\n" +
                "   Barcelona. Vidare ska anfallaren vara mångsidig och kunna spela var som helst i anfallstrion\n" +
                "   samtidigt som han kan göra mål på det mesta, men inte vara vara alldeles för dyr.");

        Article article2 = new Article(
                R.drawable.henrik_larsson,
                "Hamrén: Kunde ha slutat i katastrof",
                "VADUZ. Det är en blåbärsnation som ska besegras i EM-kvalet.\n" +
                        "Då körde Hamrén ett nytt knep för att tända spelarna på dagens träning.\n" +
                        "– Jag körde Skåne mot övriga Sverige. Det var väldigt intensivt, säger han på dagens presskonferens.",
                "Det är en måstematch för Sverige i morgon kväll på Rheinstadion i Vaduz mot Liechtenstein.\n" +
                        "Seger och tre poäng är måste för att hålla Blågults dröm om en andra- och direktplats till EM i Frankrike nästa sommar vid liv.\n" +
                        "Respekt för Liechtenstein\n" +
                        "Hemma mot Liechtenstein på Friends vann dock Sverige bara med 2-0 trots ett stort spelövertag.\n" +
                        "– Jag har respekt för Liechtenstein, som för alla lag. De släppte in en hel del mål mot Ryssland (0-7), men det krävdes en straff för ryssarna och ett rött kort för Liechtenstein för att det skulle lossna, säger Erik Hamrén.\n" +
                        "Vad blir viktigt i ert anfallsspel?\n" +
                        "– Vi måste ha tålamod. Har vi kvaliteten och sedan disciplinen när vi tappar boll så vinner vi den här matchen. Vi behöver ha stor rörelse, säger Hamrén är tyst ett ögonblick och säger sedan:\n" +
                        "– Liechtenstein är som en kvinna som man ska dansa med, men som inte tycker om att dansa. Det gäller att jobba hårt med fotarbetet för att få fart på dansen.\n" +
                        "Förbundskapten berömde intensiteten på den avslutande träningen.");


        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);

        return articles;
    }

    public static List<Article> getNewsArticles() {
        List<Article> articles = new ArrayList<>();

        Article article1 = new Article(
                R.drawable.idol,
                "Vitryska Svetlana Aleksijevitj får Nobelpriset",
                "Äntligen! Förhandsfavoriten Svetlana Aleksijevitj, 67, tilldelas Nobelpriset i litteratur 2015.\n" +
                        "– Det här betyder väldigt mycket för yttrandefriheten i både Vitryssland och Ryssland. Makten kan åtminstone inte längre avfärda mig med en handviftning, säger Svetlana Aleksijevitj till SvD.",
                "Årets Nobelpris i litteratur går till den vitryska författaren Svetlana Aleksijevitj. Det meddelade Svenska Akademiens nytillträdda ständiga sekreterare Sara Danius i Börshuset i Stockholm i dag.\n" +
                        "Motiveringen lyder: \"För hennes mångstämmiga verk, ett monument över lidande och mod i vår tid\".\n" +
                        "Till Svd säger Svetlana Aleksijevitj att hon tar emot beskedet med blandade känslor.\n" +
                        "– Det är så många svåra känslor. Det här är en enorm sak. Att vara en i raden – Boris Pasternak, Aleksandr Solzjenitsyn, Ivan Bunin... Det här är fantastiskt men också sorgligt. Från och med nu kommer det här priset att för alltid ligga på mina axlar. Det innebär att det blir svårare att jobba, säger hon.\n" +
                        "Svetlana Aleksijevitj använder journalistiska arbetsmetoder och har skrivit en serie dokumentärromaner om Sovjetmänniskan som kallas ”Utopins röster - eller Historien om den röda människan”.\n" +
                        "\"Är så lycklig\"\n" +
                        "Prissumman är i år åtta miljoner kronor. Litteraturpristagaren får tillsammans med de andra Nobelpristagarna ta emot priset i Konserthuset i Stockholm på Nobeldagen den 10 december.\n" +
                        "Svetlana Aleksijevitj svenska översättare Kajsa Öberg Lindsten säger att hon är ”så lycklig\".\n" +
                        "– Hon är en kär vän. Jag är oerhört lycklig att denna djärva genre i den ryska litteraturen belönas som den är värd.\n" +
                        "Vad kännetecknar hennes böcker?\n" +
                        "– Det är levande röster, hon intervjuar folk men skriver inte reportage utan det är en slags tankemässig musik. Hon är oerhört viktig för många människor som känner att hon gett dem tillbaka deras sanna historia i form av stor litteratur. Det är svårt att förstå när man bor i lugna Sverige hur det är att leva i tystnad och lögn, säger hon.\n" +
                        "Kajsa Öberg Lindsten är just nu på väg till Minsk för att träffa Svetlana Aleksijevitj tillsammans med en dokumentärfilmare.\n" +
                        "– Jag sitter på Arlanda och visste inte hur det gått förrän folk började ringa. Jag träffar henne i kväll. Jag kommer att gråta av glädje och krama om henne.");

        Article article2 = new Article(
                R.drawable.mc_gang,
                "Då ska VW börja fixa skandalbilarna",
                "Det kan bli aktuellt med både ny mjukvara och med nya delar för de 11 miljoner bilar som är berörda av Volkswagens miljöfusk.",
                "– Om allt går som planerat kan vi börja åtgärda bilarna i januari, säger VW:s vd Matthias Müller.\n" +
                        "Nu stämmer den första privatpersonen i Tyskland VW och kräver ett återköp.\n" +
                        "\n" +
                        "– Mot slutet av 2016 bör alla bilar vara åtgärdade, säger Müller i en exklusiv intervju i tyska tidningen FAZ.\n" +
                        "Eftersom motorn EA 189 sitter i så vitt skilda bilar över hela världen säger han:\n" +
                        "– Vi behöver inte en lösning, utan tusentals.\n" +
                        "\n" +
                        "För de flesta bilar räcker det med en uppdatering av mjukvaran, men för vissa kan det bli nödvändigt med ny insprutning och katalysatorer. Det blir betydligt dyrare för VW – minst 10 000 kronor per bil. VW:s ingenjörer har nu tre månader på sig att utveckla och testa den nya mjukvaran.\n" +
                        "Vill ha pengarna tillbaka\n" +
                        "I går tog den lokala rätten i Braunschweig emot Tysklands första stämning mot VW från en privatperson. Advokaten Sascha Conradi som företräder kvinnan säger att de kräver ett återköp.\n" +
                        "– Hon köpte bilen av miljöskäl och hoppades på att köra en miljövänlig bil, nu känner hon sig besviken och vägrar använda bilen, säger Sascha Conradi till FAZ.");

        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);

        return articles;

    }

    public static List<Article> getEntertainmentArticles() {
        List<Article> articles = new ArrayList<>();

        Article article1 = new Article(
                R.drawable.idol,
                "Källor: Gina leder Melodifestivalen",
                "Dirawi blir programledare: SVT vill fira 15-årsjubileum med schlagerprofiler som sidekicks",
                "Gina Dirawi har själv gått ut i sociala medier och sagt att hon vill leda Eurovision song contest. Nu kan Nöjesbladet avslöja att hon i stället får uppdraget att vara programledare för Melodifestivalen 2016.\n" +
                        "– Det är Gina som leder festivalen nästa år, säger en person med god insyn.\n" +
                        "Flera uppgiftslämnare bekräftar för Nöjesbladet att SVT nästa år vill fira att det är 15:e året som Melodifestivalen åker på turné runt om i Sverige med fyra delfinaler, en andra chans och stor final. Och att det sammanfaller med att det 2016 är 60 år sedan den första Eurovision song contest sändes från Lugano i Schweiz.\n" +
                        "\n" +
                        "Kryddar med olika sidekicks\n" +
                        "Därför var en av planerna att man skulle lyfta in tidigare populära Melodifestivalprofiler för att leda de olika programmen.\n" +
                        "– Men man behöver en trygg punkt, det går inte att byta i varje program utan det behöver vara en programledare som tittarna känner igen genom hela serien, säger en källa.\n" +
                        "Därför kommer SVT ha en huvudprogramledare och sen krydda med sidekicks, personer som starkt förknippas med tävlingen på olika sätt.\n" +
                        "En källa nära Melodifestivalens redaktion bekräftar att Gina Dirawi är högaktuell i rollen som Melodifestivalens programledare nästa år.\n" +
                        "– Absolut, men man har inte skrivit några papper, så det är inte helt klart ännu.\n" +
                        "En uppgiftslämnare påpekar att Eurovision song contest fortfarande står överst på Dirawis önskelista.\n" +
                        "\n" +
                        "Markus Larsson [2:45 PM]\n" +
                        "Reese Witherspoon ställde in kärleksresan");

        Article article2 = new Article(
                -1,
                "HOLLYWOOD. En kärlekssemester i Italien skulle rädda Reese Witherspoons och Jim Toths äktenskap.",
                "Men den barnfria lyxresan slog bakut innan den ens inletts.\n" +
                        "– Reese fick spader när hon insåg att de skulle flyga samma dag sonen fyllde år, säger en källa.",
                "Den 39-åriga skådespelerskan och hennes 45-årige make hade planerat att tillbringa tio dagar i Neapel. Tanken var att återskapa passionen de kände under smekmånaden i Positano 2011.\n" +
                        "Toth gjorde allt han kunde för att övertyga sin fru om att barnen – Ava, 16, Deacon, 11, och Tennessee, 3, – inte skulle lida någon skada.\n" +
                        "– Tennessee skulle bara fylla 3. Han hade inte kommit ihåg mycket i alla fall, säger en av parets kompisar i veckotidningen Star.\n" +
                        "– Jim föreslog att de kunde fira sonen en dag tidigare, men Reese vägrade och ställde in resan.\n" +
                        "Jobbigt år\n" +
                        "Det har inte gjort stämningen bättre mellan parterna.\n" +
                        "– De behöver verkligen avsätta tid att jobba på förhållandet. Jim trodde att de skulle kunna göra det i Italien, säger källan som uppger att Toth är ”bedrövad” över det inträffade.\n" +
                        "Sedan tidigare har det rapporterats att Witherspoon och Toth har haft ett jobbigt år. De har grälat om allt från att utöka familjen till hennes packade schema.\n" +
                        "– De har tillbringat mer och mer tid på skilda håll. Reese är skicklig på att le och låtsas som om allt är bra, säger uppgiftslämnaren.\n" +
                        "– De håller varandra i handen när fotograferna är närvarande, men bakom stängda dörrar är det inte lika glatt som det en gång var.");

        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);
        articles.add(article1);
        articles.add(article2);

        return articles;

    }
}
