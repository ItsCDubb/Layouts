package com.example.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.layouts.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private com.example.expandablelistview.ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new com.example.expandablelistview.ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Specials");
        listDataHeader.add("Season 1");
        listDataHeader.add("Season 2");
        listDataHeader.add("Season 3");
        listDataHeader.add("Season 4");
        listDataHeader.add("Season 5");
        listDataHeader.add("Season 6");
        listDataHeader.add("Season 7");
        listDataHeader.add("Season 8");
        listDataHeader.add("Season 9");
        listDataHeader.add("Season 10");
        listDataHeader.add("Season 11");
        listDataHeader.add("Season 12");
        listDataHeader.add("Season 13");
        listDataHeader.add("Season 14");
        listDataHeader.add("Season 15");
        listDataHeader.add("Season 16");

        List<String> specials = new ArrayList<>();
        specials.add("Jump Festa 2004 Anime + Gotei 13 Omake");
        specials.add("Memories in the Rain");
        specials.add("The Sealed Sword Frenzy");
        specials.add("Memories of Nobody");
        specials.add("The Diamond Dust Rebellion");
        specials.add("Fade to Black");
        specials.add("Bleach: Hell Chapter");

        List<String> season1 = new ArrayList<>();
        season1.add("The Day I Became a Shinigami");
        season1.add("A Shinigami's Work");
        season1.add("The Older Brother's Wish, the Younger Sister's Wish");
        season1.add("Cursed Parakeet");
        season1.add("Beat the Invisible Enemy!");
        season1.add("Fight to the Death! Ichigo vs. Ichigo");
        season1.add("Greetings from a Stuffed Toy");
        season1.add("June 17, a Memory of Rain");
        season1.add("Unbeatable Enemy");
        season1.add("Assault on Trip at Sacred Ground!");
        season1.add("The Legendary Quincy");
        season1.add("A Gentle Right Arm");
        season1.add("Flower and Hollow");
        season1.add("Back to Back, a Fight to the Death!");
        season1.add("Kon's Great Plan");
        season1.add("The Encounter, Renji Abarai!");
        season1.add("Ichigo Dies!");
        season1.add("Reclaim! The Power of the Shinigami");
        season1.add("Ichigo Becomes a Hollow!");
        season1.add("Ichimaru Gin's Shadow");

        List<String> season2 = new ArrayList<>();
        season2.add("Enter! The World of the Shinigami");
        season2.add("The Man Who Hates Shinigami");
        season2.add("The Sentence of Rukia, Before the 14th Day");
        season2.add("Assemble! The 13 Divisions");
        season2.add("Penetrate the Centre With an Enormous Bombshell?");
        season2.add("Formation! The Worst Tag");
        season2.add("Release the Death Blow!");
        season2.add("Orihime is Being Targeted");
        season2.add("Breakthrough! The Death God's Encompassing Net");
        season2.add("Renji's Confrontation");
        season2.add("The Resolution to Kill");
        season2.add("Stars and the Stray");
        season2.add("Miracle! The Mysterious New Hero");
        season2.add("Tragedy of Dawn");
        season2.add("Assassination of Aizen! The Darkness Which Approaches");
        season2.add("Kenpachi Zaraki Approaches!");
        season2.add("Reason of the Fist");
        season2.add("Desperation! The Broken Zangetsu");
        season2.add("The Man of Immortality");
        season2.add("The Shinigami Whom Ganju Met");
        season2.add("Reunion, Ichigo and Rukia");

        List<String> season3 = new ArrayList<>();
        season3.add("Yoruichi, Master of Speed, Dances!");
        season3.add("The Despicable Shinigami");
        season3.add("Ishida, Limits of Power!");
        season3.add("Overcome the Limits!");
        season3.add("Authentic Records! School of Shinigami");
        season3.add("The Avengers");
        season3.add("Hitsugaya Roars!");
        season3.add("Rukia's Nightmare");
        season3.add("The Awakening Lion");
        season3.add("Morning of the Sentence");
        season3.add("Renji, Oath of the Soul! Death Match with Byakuya");
        season3.add("Ichimaru Gin's Temptation, Resolution of Destruction");
        season3.add("An Accomplished Oath! Get Back Rukia!");
        season3.add("The Strongest Shinigami! Ultimate Confrontation Between Teacher and Student");
        season3.add("Supersonic Battle! Determine the Goddess of Chivalry");
        season3.add("One Thousand Cherry Blossoms, Crushed! Zangetsu Thrusts Through the Sky");
        season3.add("Unseal! The Black Blade, the Miraculous Power");
        season3.add("Conclusion of the Death Match! White Pride and Black Desire");
        season3.add("Truth of Despair, the Dagger That Has Been Brandished");
        season3.add("Aizen Stands Out! His Terrifying Ambition");
        season3.add("Congress Together! The Strongest Shinigami Organization");
        season3.add("Rukia's Resolution, Ichigo's Feelings");

        List<String> season4 = new ArrayList<>();
        season4.add("New School Term, Renji Has Come to the Material World?!");
        season4.add("Creeping Terror, the Second Victim");
        season4.add("Break Through! The Trap Hidden in the Labyrinth");
        season4.add("Death Game! The Missing Classmate");
        season4.add("True Identity of the Devil, the Secret Which is Revealed");
        season4.add("Baunt! The Soul Hunters");
        season4.add("Return of Rukia! The Substitute Team Revival");
        season4.add("The Moment of Collision!! An Evil Hand Draws Near to the Quincy");
        season4.add("Water Attack! Escape from the Shutdown Hospital");
        season4.add("Gathering at the Place of Destiny! The Man Who Makes His Move");
        season4.add("Memories of an Eternally Living Clan");
        season4.add("Earth-Shattering Event at 11th Division! The Shinigami that Rises Again");
        season4.add("Crashing Force! Friido vs. Zangetsu");
        season4.add("Vanishing Grudge! The Shinigami that Kenpachi Cut Down");
        season4.add("Shocking Revelations for the Gotei 13 Divisions!! The Truth Buried in History");
        season4.add("Yoshino's Decision of Death");
        season4.add("Assault from a Formidable Enemy! A Tiny Final Line of Defense?");
        season4.add("Hitsugaya Moves! The Attacked City");
        season4.add("Ichigo vs. Daruku! The Appearance of the Faded Darkness");
        season4.add("Grey Shadow, the Secret of the Doll");
        season4.add("Breaking Up of the Substitute Team? The Betrayal of Rukia");
        season4.add("Battle of Tears! Rukia vs. Orihime");
        season4.add("Rangiku Dances! Cut Down the Invisible Enemy");
        season4.add("Byakuya Assembles! The Gotei 13 Divisions Make Their Move");
        season4.add("Annihilation of the Vice-Captains!? Trap in the Underground Cave");
        season4.add("Rematch?! Ishida vs. Nemu");
        season4.add("Abarai Renji, Soul of Bankai!");
        season4.add("Shinigami and Quincy! The Reviving Power!");

        List<String> season5 = new ArrayList<>();
        season5.add("Enter the World of the Shinigami, Again");
        season5.add("Assault of the Bounts! Chaos in the Gotei 13 Divisions");
        season5.add("Hitsugaya's Resolution! The Moment of Conflict Approaches");
        season5.add("Byakuya Takes the Field! Dance of the Wind-Splitting Cherry Blossoms");
        season5.add("Ichigo - Byakuya - Kariya, Battle of the Three Extremes!");
        season5.add("Hitsugaya Moves Out! Cut Down the Enemy in the Forest");
        season5.add("Clash! Zaraki Kenpachi vs. Ichinose Maki");
        season5.add("Shinigami vs. Shinigami! The Uncontrollable Power");
        season5.add("Soi Fong Dies? The Last of the Secret Mobile Corps");
        season5.add("Mayuri's Bankai! Sawatari* Clash of the Demon");
        season5.add("The Last Quincy! The Exploding Power");
        season5.add("Ishida, Exceeding the Limits to Attack!");
        season5.add("10th Division's Death Struggle! The Release of Hyourinmaru");
        season5.add("Kariya! Countdown to the Detonation");
        season5.add("Life and Revenge! Ishida, the Ultimate Choice");
        season5.add("The Swung-Down Edge! The Moment of Ruin");
        season5.add("The Wailing Bount! The Last Clash");
        season5.add("Ichigo and Rukia, Thoughts in the Revolving Sky");

        List<String> season6 = new ArrayList<>();
        season6.add("Reopening of the Substitute Business! The Terrifying Transfer Student");
        season6.add("Shock! The Father's True Character");
        season6.add("The Commencement of War, the Vizards and the Arrancars");
        season6.add("Prelude to the Apocalypse, the Arrancar Offensive!");
        season6.add("Reunion, Ichigo and Rukia");
        season6.add("Mission! The Shinigamis Who Came");
        season6.add("The Evil Eye, Aizen Again");
        season6.add("Rukia's Battle Begins! The Freezing White Blade");
        season6.add("Ikkaku's Bankai! The Power that Breaks Everything");
        season6.add("Team Zaraki's Secret Story! The Lucky Men");
        season6.add("Hitsugaya Scatters! The Broken Hyourinmaru");
        season6.add("Clash! The Protector vs. the Bearer");
        season6.add("Vizard! The Power of the Awakened");
        season6.add("Ichigo, Complete Hollowification?!");
        season6.add("Clash! The Black Bankai and the White Bankai");
        season6.add("Urgent Report! Aizen's Terrifying Plan");
        season6.add("Uryuu vs. Ryuuken! Clash of the Parent-Child Quincys");
        season6.add("Urahara's Decision, Orihime's Thoughts");
        season6.add("The Nightmare Arrancar! Team Hitsugaya Moves Out");
        season6.add("The Swooping Descent of the Dark Emissary! The Propagation of Malice");
        season6.add("The Invisible Enemy! Hitsugaya's Merciless Decision");
        season6.add("Rangiku's Tears, the Sorrowful Parting of Brother and Sister");

        List<String> season7 = new ArrayList<>();
        season7.add("Hitsugaya, Karin and Soccer Ball");
        season7.add("Ikkaku's Hot-Blooded Kendo Tale");
        season7.add("The Beautiful Patissier, Yumichika!");
        season7.add("Kon is Deceived! Rangiku on the Lookout");
        season7.add("Civil War in Hueco Mondo! Ulquiorra's Death");
        season7.add("The Malicious Battle, Aizen's Trap");
        season7.add("Hueco Mondo Moves Again! Hitsugaya vs. Yammy");
        season7.add("Ichigo vs. Grimmjow, the 11-second Battle");
        season7.add("Ulquiorra's Scheme, the Moment When the Sun Sets");
        season7.add("Goodbye..., Kurosaki");
        season7.add("Strict Order! The Forbidden Rescue of Inoue Orihime");
        season7.add("Grimmjow's Revival");
        season7.add("Ishida Chad, the Quickening of a New Power");
        season7.add("The Espada Gathers! Aizen's Royal Assembly");
        season7.add("The Name is Nel! The Appearance of the Strange Arrancar");
        season7.add("The Forest of Menos! The Search for the Missing Rukia");
        season7.add("Ashido, the Shinigami Who Came from the Past");
        season7.add("Through the Crumbling Forest, a Million Menos");
        season7.add("Oath! Back Here Alive Again");
        season7.add("The Raging Storm! Encounter With the Dancing Arrancar");

        List<String> season8 = new ArrayList<>();
        season8.add("Ichigo Strikes Back! This is My Bankai");
        season8.add("The Devilish Research! Szayel Aporro's Plan");
        season8.add("Rukia and Kaien, the Sorrowful Reunion");
        season8.add("Rukia Retaliates! Release the Desperate Kidou");
        season8.add("Ishida & Pesshe, the United Attack of Friendship");
        season8.add("Ishida's Trump Card, Seele Schneider");
        season8.add("Right Arm of the Giant, Left Arm of the Devil");
        season8.add("Sado Yasutora Dies! Orihime's Tears");
        season8.add("Testament - Your Heart is Right Here...");
        season8.add("The Cruel Arrancar, Ulquiorra's Provocation");
        season8.add("Syazel Aporro Laughs, the Net Trapping Renji is Complete");
        season8.add("Shinigami and Quincy, the Battle with Madness");
        season8.add("Ishida's Strategy, the 20-second Offense and Defense");
        season8.add("The Murderous Intent Boils! The Joyful Grimmjow");
        season8.add("Desperate Effort vs. Desperate Effort! The Hollowized Ichigo");
        season8.add("The Moment of Conclusion, the End of Grimmjow");

        List<String> season9 = new ArrayList<>();
        season9.add("The New Captain Appears! His Name is Shusuke Amagai");
        season9.add("New Development, the Dangerous Transfer Student Appears!");
        season9.add("Desperate Struggle Under the Moonlit Night, the Mysterious Assassin and Zanpakutō");
        season9.add("Kenryu, the Profusion of Blooming Crimson Flowers");
        season9.add("Kibune Goes to War! The Violent Wind That Rages");
        season9.add("The Appearance of the Great Evil! The Darkness in the House of Kasumioji");
        season9.add("Break the Mirror's Boundary! Ichigo's Captivity!");
        season9.add("The Revenging Assassin, Ichigo is Targeted");
        season9.add("Mystery! The Sword-Consuming Assassin");
        season9.add("The Reversal of Rukia, the Rampaging Blade");
        season9.add("The Nightmare Which is Shown, Ichigo's Inside the Mirror");
        season9.add("Confrontation?! Amagai vs. Gotei 13");
        season9.add("The Princess' Decision, the Sorrowful Blade");
        season9.add("The 2nd Division Sorties! Ichigo is Surrounded");
        season9.add("Amagai's True Strength, Zanpakutō is Released!");
        season9.add("The Darkness Which Moves! Kibune's True Colors");
        season9.add("Kira and Kibune, Offense and Defense of the 3rd Division");
        season9.add("Ice and Flame! Fierce Fight of Amagai vs. Hitsugaya");
        season9.add("Sortie Orders! Suppress the House of Kasumiōji");
        season9.add("Ichigo Rages! The Assassin's Secret");
        season9.add("Duel! Amagai vs. Ichigo");
        season9.add("The Fallen Shinigami's Pride");

        List<String> season10 = new ArrayList<>();
        season10.add("Hueco Mundo Chapter, Restart!");
        season10.add("Szayel Aporro's Theater");
        season10.add("Nel's Secret, a Big-Breasted Beauty Joins the Battle!?");
        season10.add("The Irresistable, Puppet Show of Terror");
        season10.add("Neliel's Past");
        season10.add("The Ultimate Union! Pesche's Seriousness");
        season10.add("Joining the Battle! The Strongest Shinigami Army Appears");
        season10.add("Byakuya's Bankai, the Quiet Anger");
        season10.add("The Two Scientists, Mayuri's Trap");
        season10.add("The Resurrecting Szayel Aporro");
        season10.add("The Hardest Body!? Cut Down Nnoitra");
        season10.add("Nnoitra Released! Multiplying Arms");
        season10.add("Fierce Fighting Conclusion! Who's the Strongest?");
        season10.add("Karakura Town Gathers! Aizen Versus Shinigami");
        season10.add("Ichigo's Seppuku Persuasion Strategy");
        season10.add("Thump! A Kemari Tournament Filled with Hollows");

        List<String> season11 = new ArrayList<>();
        season11.add("The Past Chapter Begins! The Truth from 110 Years Ago");
        season11.add("12th Division's New Captain, Urahara Kisuke");
        season11.add("Aizen And The Boy Genius");
        season11.add("Muguruma 9th Division, Moves Out");
        season11.add("Hiyori Dies? The Beginning of Tragedy");
        season11.add("Betrayal! Aizen's Secret Maneuvers");
        season11.add("Rescue Hirako! Aizen vs. Urahara");

        List<String> season12 = new ArrayList<>();
        season12.add("The Soul Burial Detective, Karakuraizer is Born");
        season12.add("Karakuraizer's Last Day");
        season12.add("Defend Karakura Town! Entire Appearance of the Shinigami");
        season12.add("Elite! The Four Shinigami");
        season12.add("Beautiful Little Devil Charlotte");
        season12.add("Kira, the Battle Within Despair");
        season12.add("Hisagi's Shikai! The Name is...");
        season12.add("Ikkaku Falls! The Shinigami's Crisis");
        season12.add("The Full Showdown! Shinigami vs. Espada");
        season12.add("The Most Evil Tag!? Soi Fon & Ōmaeda");
        season12.add("A Miraculous Body! Ggio Releases");
        season12.add("3 vs. 1 Battle! Rangiku's Crisis");
        season12.add("All Vice-Captains Annihilated! The Terrifying Demonic Beast");
        season12.add("Fierce Fighting Concludes? Towards a New Battle!");
        season12.add("Wonderful Error");
        season12.add("Summer! Sea! Swimsuit Festival!");
        season12.add("Cry of the Soul? The Rug Shinigami is Born!");

        List<String> season13 = new ArrayList<>();
        season13.add("The Materialization of Zanpakutō");
        season13.add("Byakuya, Disappearing with the Cherry Blossoms");
        season13.add("Sode no Shirayuki vs. Rukia! Confused Heart");
        season13.add("Zangetsu Becomes an Enemy");
        season13.add("Renji Surprised?! The Two Zabimarus");
        season13.add("Clash! Hisagi vs. Kazeshin");
        season13.add("Release! The New Getsuga Tenshō");
        season13.add("Soi Fon, Surrounding the Zanpakutō");
        season13.add("Friendship? Hatred? Haineko & Tobiume");
        season13.add("The Awakening Hyōrinmaru! Hitsugaya's Fierce Fight");
        season13.add("Byakuya's Betrayal");
        season13.add("For the Sake of Pride! Byakuya vs. Renji");
        season13.add("Shinigami and Zanpakuto, Total Sortie");
        season13.add("One-to-One Fight! Ichigo vs. Senbonzakura");
        season13.add("The long awaited... Kenpachi appears!");
        season13.add("Pursue Byakuya! The Confused Gotei Divisions");
        season13.add("Special Mission! Rescue Captain-Commander Yamamoto!");
        season13.add("Deceived Shinigami! The World Collapse Crisis");
        season13.add("Dragon of Ice and Dragon of Flame! The Strongest Showdown!");
        season13.add("Senbonzakura's Bankai! Offense and Defense of the Living World");
        season13.add("That Man, For the Sake of the Kuchiki");
        season13.add("Dark History! The Worst Shinigami is Born");
        season13.add("Byakuya, the Truth Behind His Betrayal");
        season13.add("Muramasa's True Identity Revealed");
        season13.add("Byakuya and Renji, the 6th Division Returns");
        season13.add("Final Chapter: Zanpakutō Unknown Tales");
        season13.add("Byakuya's Anger! The Kuchiki Family Collapses");
        season13.add("A New Enemy! The True Nature of the Beast Swords");
        season13.add("Stray Snake, Tortured Monkey");
        season13.add("Terror! The Monster That Lurks Underground");
        season13.add("Conclusion?! Hisagi vs. Kazeshini");
        season13.add("The Person with the Unknown Ability! Orihime is Targeted");
        season13.add("Haineko Cries! The Tragic Sword Beast");
        season13.add("Imprisonment?! Senbonzakura & Zabimaru");
        season13.add("Battle of the Females? Nanao vs. Katen Kyōkotsu");
        season13.add("Evolution?! The Wonder of the Final Sword Beast");

        List<String> season14 = new ArrayList<>();
        season14.add("Ichigo vs. Ulquiorra");
        season14.add("Connected Hearts! The Left Fist Prepared for Death!");
        season14.add("Hatred and Jealousy, Orihime's Dilemma");
        season14.add("Ichigo and Uryū, Bonded Back to Back");
        season14.add("Beginning of Despair... Ichigo, the Unreachable Blade");
        season14.add("Ichigo Dies! Orihime, the Cry of Sorrow!");
        season14.add("Ichigo vs. Ulquiorra, Conclusion!");
        season14.add("Fury of the Shark! Halibel Releases");
        season14.add("Hitsugaya, the Suicidal Frozen Heavens Hundred Flowers Funeral!");
        season14.add("The Approaching Breath of Death, the King Who Rules Over Death!");
        season14.add("One Hit Kill, Soi Fon, Bankai!");
        season14.add("Climax! Kyōraku vs. Starrk!");
        season14.add("The Nightmare Returns... Revival of the Espada");
        season14.add("Hirako and Aizen...the Reunion of Fate!");
        season14.add("Hisagi and Tōsen: The Moment of Parting");
        season14.add("Crown of Lies, Barragan's Grudge");
        season14.add("Power of the Soul! Los Lobos, Attack!");
        season14.add("Stark, the Lone Battle");
        season14.add("Chain of Sacrifice, Halibel's Past");
        season14.add("The Hundred-Year Grudge! Hiyori's Revenge");
        season14.add("Ichigo's Return! Protect Karakura Town");
        season14.add("Side Story! Ichigo and the Magic Lamp");
        season14.add("The Final Trump Card! Ichigo, Towards the Decisive Battle");
        season14.add("Byakuya vs. Kenpachi?! The Melee Commences");
        season14.add("For the Sake of Justice?! The Man Who Deserted the Shinigami");
        season14.add("Desperate Struggle with Aizen! Hirako, Shikai!");
        season14.add("All Out War! Aizen vs. Shinigami");
        season14.add("Blade of Hatred! Hitsugaya, Enraged!");
        season14.add("The Sealed Genryūsai");
        season14.add("It's All A Trap...Engineered Bonds!");
        season14.add("The Shocking Truth...The Mysterious Power Within Ichigo!");
        season14.add("The Extending Blade?! Ichigo vs. Gin!");
        season14.add("Film! Festival! Shinigami Film Festival!");
        season14.add("Theatre Opening Commemoration! Hell Chapter・Prologue");
        season14.add("Urahara Appears! Stop Aizen!");
        season14.add("Ichigo Loses His Fighting Spirit!? Gin's Expectation!");
        season14.add("The Final Getsuga Tenshō!? Ichigo's Training!");
        season14.add("Real World and Shinigami! The New Year Special!");
        season14.add("Gaiden Again! This Time's Enemy is a Monster?");
        season14.add("Delusion Roars! Hisagi, Towards the Hot Springs Inn!");
        season14.add("For the Sake of Protecting! Ichigo vs. Tensa Zangetsu!");
        season14.add("Emergency Situation! Aizen, New Evolution!");
        season14.add("Goodbye...Rangiku");
        season14.add("Fierce Fighting Conclusion! Release, the Final Getsuga Tenshō!");
        season14.add("Ichigo's Resolution");
        season14.add("The Soul Detective ・Karakuraizer Takes Off Again!");
        season14.add("Inauguration! The Brand New 2nd Division Captain!");
        season14.add("The Man Who Takes Command of the 11th Division!");
        season14.add("Secret of a Beautiful Office Lady");
        season14.add("Yachiru's Friend! The Shinigami of Justice Appears!");
        season14.add("Hitsugaya Toushirou's Day Off!");


        List<String> season15 = new ArrayList<>();
        season15.add("Gotei 13 Invading Army Arc! Unusual Incident in Seireitei?!");
        season15.add("Battle With Comrades! Renji vs. Rukia?!");
        season15.add("Ichigo's Capture Net!");
        season15.add("Gotei 13, Gathering in the Real World!");
        season15.add("Showdown of Mutual Self, Ikkaku vs. Ikkaku!");
        season15.add("Clash! Rukia vs. Rukia!");
        season15.add("Protect Ichigo! Nozomi's Determination");
        season15.add("Recapture Seireitei!");
        season15.add("For the Sake of the Believers! Byakuya vs. Hitsugaya!");
        season15.add("The Two Hinamori, Hitsugaya's Resolution");
        season15.add("Pride of the Kuchiki Family! Byakuya vs. Byakuya!");
        season15.add("Defeat Kageroza! Shinigami, All-Out War!");
        season15.add("The Forbidden Research...Nozomi's Hidden Secret!");
        season15.add("I Want to Live...! Nozomi's Zanpakutō");
        season15.add("For the Sake of Fighting! The Awakening Nozomi!");
        season15.add("The Most Evil Reigai, Appears in the Real World!");
        season15.add("Destroy Nozomi?! Genryusai's Decision");
        season15.add("The Depleting Reiatsu! Ichigo, Death Struggle of the Soul!");
        season15.add("Hiding in the Precipice World? Ichigo is Alone?!");
        season15.add("Pursue Kageroza! Technological Development Department, Infiltration!");
        season15.add("The Developer of the Modified Souls");
        season15.add("Kon's Thoughts, Nozomi's Thoughts");
        season15.add("Protect Ichigo! The Bonds of Friendship");
        season15.add("Reigai vs. Original, The Fierce Fighting for Gambled Pride!");
        season15.add("Invading Army Arc, Final Conclusion!");
        season15.add("Thank You");

        List<String> season16 = new ArrayList<>();
        season16.add("3rd Year High School Student! Dressed up, and a New Chapter Begins!");
        season16.add("A Dispute in School?! Ichigo and Uryuu, Fight Together!");
        season16.add("Uryuu is Attacked, A Threat Draws Near the Friends!");
        season16.add("The Fullbring User - Kugo Ginjo");
        season16.add("A Creeping Danger in the Kurosaki Family?! Ichigo's Confusion!");
        season16.add("Power of the Substitute Badge, Ichigo's 'Pride'!");
        season16.add("Next Target, The Devil's Hand Aims at Orihime!");
        season16.add("The Man Who Killed A Shinigami Substitute?! Tsukishima Makes His Move");
        season16.add("Fullbring, The Detested Power!");
        season16.add("Tsukishima Attacks! The Training Has Been Thwarted!");
        season16.add("Ichigo, Mastering the Fullbring!");
        season16.add("Ichigo vs. Ginjo! To the Game's Space");
        season16.add("The Shinigami Enter Battle! Seireitei Also Has a New Year Special!");
        season16.add("Foe or Friend?! Ginjo's Unseen Heart!");
        season16.add("Creeping Menace...Tsukishima's Ability!");
        season16.add("Clash?! Xcution Attacks Ginjo");
        season16.add("The Sorrowful Battle! Ichigo vs. Sado & Orihime!");
        season16.add("Ichigo vs Uryu?! Who is the Traitor?!");
        season16.add("A New Appearance! Meet the Gotei 13!");
        season16.add("Revival! Substitute Shinigami - Ichigo Kurosaki!");
        season16.add("Fierce Fight! Shinigami vs. Xcution");
        season16.add("Desperate Struggle!? Byakuya's Troubled Memories");
        season16.add("Ichigo vs. Ginjo! Secret of the Substitute Badge");
        season16.add("Changing History, Unchanging Heart");

        listHash.put(listDataHeader.get(0),specials);
        listHash.put(listDataHeader.get(1),season1);
        listHash.put(listDataHeader.get(2),season2);
        listHash.put(listDataHeader.get(3),season3);
        listHash.put(listDataHeader.get(4),season4);
        listHash.put(listDataHeader.get(5),season5);
        listHash.put(listDataHeader.get(6),season6);
        listHash.put(listDataHeader.get(7),season7);
        listHash.put(listDataHeader.get(8),season8);
        listHash.put(listDataHeader.get(9),season9);
        listHash.put(listDataHeader.get(10),season10);
        listHash.put(listDataHeader.get(11),season11);
        listHash.put(listDataHeader.get(12),season12);
        listHash.put(listDataHeader.get(13),season13);
        listHash.put(listDataHeader.get(14),season14);
        listHash.put(listDataHeader.get(15),season15);
        listHash.put(listDataHeader.get(16),season16);

    }
}
