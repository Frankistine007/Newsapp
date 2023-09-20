package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Politics: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.rvitems)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val news_data = listOf(

            News(R.drawable.img_38,"The dangers posed by a deal between Russia and North Korea","Russia is currently firing some 14 million shells a year in Ukraine. They are only manufacturing 2 million. The Ukrainians, on the other hand, are firing around 2.5 million shells a year, but are also struggling to source them.\n" +
                    "\n" +
                    "A deal between North Korea and Russia for artillery rounds, which the respective leaders have said they are “actively advancing”, is a simple solution to Russia’s problem. But it is a deal that is fraught with dangers for global stability.\n" +
                    "\n" +
                    "The sanctions on Russia since their invasion of Ukraine have limited where they can buy military equipment, including artillery rounds: it has made requests to China, Iran and now North Korea. China has been warm but publicly resisted directly supplying equipment into the battlefield.\n" +
                    "\n" +
                    "Iran has sold Russia drones and a small quantity of shells. North Korea is the first nation to make the move to directly supply a large quantity of ammunition for Russian artillery. Placed within its wider context this deal will likely be written up in history as part of the journey to a wider war.Both Russian president Vladimir Putin and North Korean leader Kim Jong-Un are reluctant to travel internationally. The meeting with Putin on September 13 is the first time Kim has travelled internationally since the outbreak of COVID in 2020.\n" +

                    "\n" +
                    "He travelled in a heavily armoured train. A face-to-face meeting is a symbolically important event for both men: because of its rarity and because its proximity signals trust.What Russia needs\n" +
                    "Russian ground offensives and their well dug-in defensive lines have been reliant on the extensive use of artillery.\n" +
                    "\n" +
                    "The Russian army has been ineffective at maintaining their supplies of shells, which has increased the pressure on them to buy from the international market. By contrast, the stocks of shells on the Korean peninsula - a legacy of the Korean War (1950-1953), which still remains technically at ceasefire, rather than over - are well maintained by North and South Korea.\n" +
                    "\n" +
                    "Consequently, the US is buying South Korean shells to transfer to Ukraine, and Russia will shortly be receiving North Korean shells. The rates of fire from both sides can, therefore, be maintained while their domestic industries continue to transform to meet the needs of this war.Russia is not a natural ally of North Korea. In the 1990s, Russia was part of international efforts to restrain North Korea’s development of nuclear technologies.\n" +
                    "\n" +
                    "By instinct, Russia, like China, has a strong preference for stability in its near neighbours, and a nuclear North Korea with the ability to reach the US or Europe would be destabilising. However, the invasion of Ukraine and the need for a large amount of artillery ammunition has created the basis for this pragmatic alliance."),
            News(R.drawable.img_39,"Historic CWC meeting in Telangana: Congress gears up for electoral battle","The Congress Working Committee (CWC) has chosen to convene its meeting outside Delhi for the first time in years. Set to be held on September 16 in Telangana's capital Hyderabad, this strategic meeting is not only designed to chart out election plans but also aims to signify the party’s commitment to displace the current BRS government in the state.Congress top brass in full attendance\n" +
                    "Mallikarjun Kharge, the Congress chief, will spearhead the meeting, supported by general secretaries K C Venugopal and Jairam Ramesh. Also expected to attend are former party presidents Sonia Gandhi and Rahul Gandhi. Venugopal revealed that out of 90 invitees, 84 confirmed their attendance, including four sitting chief ministers, PTI reported.Congress leaders have expressed optimism that the high-profile meeting will serve as a transformative moment for both the party and Telangana's political landscape. They believe that the discussions could be a pivotal game-changer in shaping upcoming electoral battles.Extended meeting on Sunday\n" +
                    "On the day following the initial meeting, an extended version of the CWC will take place. This larger gathering will include state party chiefs, Central Election Committee members, and Parliamentary Party office-bearers. Venugopal disclosed that 147 out of 159 invited members will be in attendance to strategise for upcoming elections."),
            News(R.drawable.img_40,"INDIA boycotting some TV news anchor to avoid 'WhatsApp group of BJP Media cell","The coordination committee authorised the sub-group on media to decide upon the names of the anchors on whose shows none of the INDIA parties will send their representatives,\" Congress general secretary KC Venugopal said after the meeting on Wednesday.\n" +
                    "\n" +
                    "\"The Congress has decided to not send spokespersons on television debates for a month. All media channels/editors are requested to not place Congress representatives on their shows,\" senior party leader Randeep Surjewala had posted on X (former Twitter).\n" +
                    "\n" +
                    "The Coordination Committee has also decided to begin the process of seat-sharing in view of next year's general elections.New Delhi: Putting all speculations to rest, the Union government on Tuesday introduced the Women’s Reservation Bill to reserve one-third seats in the Parliament and state legislative assemblies.The Constitution (One Hundred and Twenty-Eight Amendment) Bill, 2023 proposes to reserve “as nearly as may be\" one-third of the seats kept already reserved for people from the scheduled caste and scheduled (SC/ST) tribe communities.\n" +
                    "\n" +
                    "The Bill, if passed, would come into effect post “an exercise of delimitation is undertaken for this purpose after the relevant figures for the first census taken after commencement\" of the Act.\n" +
                    "\n" +
                    "Further the Act will be effective for a period of 15 years post its commencement.\n" +
                    "\n" +
                    "In his address to the Lok Sabha in the new parliament building, prime minister Narendra Modi said, “‘Narishakti Vandan Adhiniyam’ will further strengthen our democracy."),
            News(R.drawable.img_41,"Bihar minister compares Ramcharitmanas to cyanide, BJP hits back","The political heat in Bihar is up as the state Education minister Chandra Shekhar has stirred controversy again with his remarks comparing ancient scriptures like the Ramcharitmanas to \"potassium cyanide\". The remarks by the RJD leader have created a fresh stir in the state with NDA attacking Bihar Chief Minister Nitish Kumar and larger I.N.D.I.A bloc over the issue.\"It is not just my view but even great Hindi writer Nagarjuna and socialist thinker Ram Manohar Lohia have said that the Ramcharitmanas contains many regressive thoughts,\" the RJD said during an event on Thursday.\n" +
                    "\n" +
                    "The minister admitted \"there are many great things in scriptures\" but was quick to add \"if at a feast 55 dishes are served with a sprinkling of potassium cyanide, the food is rendered unfit for consumption\".As the remarks drew flak on social media platforms, the minister claimed that his remarks were about caste discrimination. He alleged that while he is receiving threats of physical violence over his statement, nobody says anything when similar concerns are expressed by RSS chief Mohan Bhagwat.\n" +
                    "\n" +
                    "The Nitish Kumar-led Bihar government was quick to disassociate themselves from the remarks of the RJD leader. “The Constitution entails that all faiths are to be accorded equal respect. Some people say things with no apparent purpose other than getting some limelight, which we disapprove of,\" said Abhishek Jha, state spokesman of JD(U).Showcase 'mental perversion': BJP\n" +
                    "The remakrs drew sharp reaction from NDA partners in Bihar- BJP and LJP. The BJP leaders condemned the remarks with Bihar Leader of Opposition (LoP) calling it “mental perversion\". \"...Where is it written in the Constitution that secularism means abusing your own religion...This is mental perversion...\" Bihar LoP Vijay Sinha said.\n" +
                    "\n" +
                    "\" I would suggest keeping one Guru, reading each line of Ramayan and understanding the essence of each word and then comment on Ramayan-Mahabharat...They should not say such things...This represents their sick mentality...This represents an appeasement mentality...Mahabharat and Ramayan are not cyanide...Appeasement, corruption, and governments giving refuge to criminals are cyanide...\" Bihar leader and Union Minister Nityanand Rai said.\n" +
                    "\n" +
                    "\"...He is the education minister of that state where for years the courses are not over. Where the quality of primary education is degrading. Where there is no infrastructure and benches for students...By giving these controversial statements, anyone can identify that this will give rise to division in society...For once, did the education Minister try to know, why students of Bihar are attempting suicide in Kota...\" LJP (Ram Vilas) chief Chirag Paswan said."),
            News(R.drawable.img_42," Cong built 'mega mall of hatred' instead of ‘Mohabbat ki ducan’: Anurag Thakur","Union Minister Anurag Thakur slammed the Congress party had initially aimed to establish a 'Mohabbat ka dukaan', but instead, they have built a 'mega mall of hatred'.As reported by ANI, Anurag Thakur said, \"Some people had gone to open 'Mohabbat ka dukaan', instead they have built a 'mega mall of hatred'. Some want to erase the existence of the Hindus and crush the 'Sanatan dharma'.\"Earlier on Thursday, Thakur was addressing a public rally in Bhilwara where he said that after forming the government BJP will make the state free from corruption and establish “Ram Rajya\".\n" +
                    "\n" +
                    "\"Congress is ashamed of Sanatana Dharma, they want to end Sanatana Dharma, they want to insult Hindus and they want to crush the Constitution,\" he further added.\"Every day Congress and leaders of their supporting parties say that they will end Sanatana Dharma. They have now also started boycotting journalists and have started filing complaints. Whether it is in Chennai or Bengal, they are filing complaints out of fear,\" said Thakur.\n" +
                    "\n" +
                    "In an indirect reference to the Gandhi family, Anurag Thakur alleged that the Congress government was focused on appeasing individuals like Robert Vadra and Rahul Gandhi. He went on to mention that both the Congress party and the opposition had used derogatory language towards Prime Minister Narendra Modi, questioning, \"Will a tea seller run the country?\"Thakur said, \"When Congress was in power, it emptied the entire treasury but the Modi government has filled the treasury again while building homes and think tanks for the countrymen.\""),
            News(R.drawable.img_43,"Nuh Violence: Cong MLA Mamman Khan arrested; to be produced before court today","A court here on September 19 sent Congress MLA Mamman Khan, who has been arrested in connection with the July 31 communal violence in Haryana's Nuh district, to judicial custody for 14 days.\n" +
                    "\n" +
                    "On September 17, the court extended his police remand by two more days in connection with the FIR registered at the Nagina police station.\n" +
                    "\n"),
            News(R.drawable.img_44,"‘No cricket over bodies of our martyrs,’ Priyanka Chaturvedi amid terror attacks","‘There can be no cricket over the bodies of our martyrs.’ Shiv Sena (UTB) leader Priyanka Chaturvedi commented on Thursday in context the recent terror attacks in Kashmir.Pakistan despite its collapsed economy & being proved a failed nation continues to abet & aid terror activities in India, wonder why GoI not firmly disengaging with them on all fronts, she added.As the both countries were enthralled to see Babar Azam's team clashing with Rohit Sharma's 11, Pakistan sponsored terrorist fought with Indian Army in Kashmir.\n" +
                    "\n" +
                    "On Wednesday, an Indian Army Colonel commanding a Rashtriya Rifles Unit along with a Major and a Deputy Superintendent of Police were killed in a gunfight with terrorists in the Kokernag area of Kashmir's Anantnag district.\n" +
                    "\n" +
                    "The killed officers have been identified as Colonel Manpreet Singh, Major Ashish Dhonak & DSP Humayun Bhat.\n" +
                    "\n" +
                    "Centre talks about playing cricket, doing business with Pakistan: Sanjay Raut\n" +
                    "\n" +
                    "Apart from Chaturvedi, Shiv Sena UTB leader Sanjay Raut also took a jibe at the Centre saying, \"When the Bharatiya Janata Party (BJP) leaders were showering flowers on Prime Minister Narendra Modi over the success of G20, at the same time, terrorists were showering gunshots on the army officers in Anantnag. Three of our senior officers will killed in the encounter. This is disheartening. It shows that the situation is abnormal in Jammu and Kashmir\".If Jammu and Kashmir have been declared a union territory, it is the responsibility of the PM and the Home Minister to ensure law and order over there. Don't you feel sad? Why isn't there a statement on this from your side\"? Raut questioned the Centre.\n" +
                    "\n" +
                    "Further, the Shiv Sena leader said, \"On one hand, you (central government) say that you will acquire the Pakistan-occupied-Kashmir (PoK), on the other hand, you are playing cricket matches with Pakistan and doing business with the country\"."),
            News(R.drawable.img_45,"'Sanatani doesn't celebrate when soldiers are being martyred,' says Kapil Sibal","Rajya Sabha MP and veteran Congress leader Kapil Sibal on Friday slammed PM Modi and said that Sanatani doesn't celebrate when soldiers are being martyred.This comes after PM Modi while addressing a public gathering in Madhya Pradesh's Bina on Thursday said, that the opposition plans to destroy sanatana dharma and attack the centuries-old tradition of the country.Taking to X, Sibal said, \"Sanatan Dharma means :\n" +
                    "\n" +
                    "eternal religion\n" +
                    "\n" +
                    "Sanātanī’s virtues include :\n" +
                    "\n" +
                    "Honesty\n" +
                    "\n" +
                    "Not injuring living beings\n" +
                    "\n" +
                    "Purity\n" +
                    "\n" +
                    "Charity\n" +
                    "\n" +
                    "Generosity\n" +
                    "\n" +
                    "Patience\n" +
                    "\n" +
                    "Asceticism\n" +
                    "\n" +
                    "Goodwill\n" +
                    "\n" +
                    "Qualities that Hindutva and it’s Bhakts lack\n" +
                    "\n" +
                    "A Sanātanī does not celebrate when soldiers are being martyred !\"\n" +
                    "\n" +
                    "Earlier on Wednesday, four security personnel were killed during the clash in South Kashmir's Anantnag district. The incident has since sparked widespread protests in the Valley, with many raising slogans against Pakistan and burning posters of the country's flag.\n" +
                    "\n" +
                    "Furthermore, Sibal slammed Modi on remarks on ‘Sanatana’ and said that Sanātanī’s virtues include, honesty and not injuring living beings. \n" +
                    "\n" +
                    "The controversy originated on September 3 when Udhayanidhi Stalin, who is the son of Tamil Nadu's Chief Minister MK Stalin, made a comparison between Sanatana Dharma and diseases like dengue and malaria."),
           News(R.drawable.img_46,"Udhayanidhi Stalin, TKS Elangovan target Amit Shah for 'Hindi unites' comment","To mark Hindi Diwas, Union Home Minister Amit Shah praised the Hindi and credited it for uniting the country. However, DMK's TKS Elangovan and Udhayanidhi Stalin were quick to respond on the admiration for language and slammed the Home Minister for his remark on Thursday.On the occassion of Hindi Diwas, Union Home Minister Amit Shah said, \"Hindi is the name for unifying the diversity of languages \u200B\u200Bof India, the world's largest democracy. From the independence movement till today, Hindi has played an important role in uniting the country.\"His remark didn't sink well with the DMK leaders. That's why, he openly condemned the Union Home Minister for making the statement. He claimed that Hindi is spoken in only four or five states in India and that's why Amit Shah's “statement is totally absurd.\"“I strongly condemn the statement of Union Home Minister Amit Shah claiming that Hindi is the uniting force of India and it is empowering other regional languages,\" tweeted Stalin on X, formerly Twitter.\n" +
                   "\n" +
                   "Also Read: Jawan Box Office collection Day 6: Shah Rukh Khan's film becomes fastest Bollywood movie to surpass ₹300 crore mark\n" +
                   "\n" +
                   "He also highlighted how every state has its own language and questioned the role of Hindi in merging and empowering regional languages.")

        )

        val adapter = RVAdapterpolitics(news_data)
        recyclerView.adapter = adapter
    }
}