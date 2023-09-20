package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class International: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.rvitems)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val news_data = listOf(

            News(R.drawable.img_29,"Consulate General Of India Strongly Condemns Assault On Sikh High School Student In Canada's British Columbia, Canada","The Consulate General of India in Vancouver has expressed strong condemnation for the recent assault on a 17-year-old Sikh high school student at a bus stop in Canada's British Columbia province. The incident, which occurred at the intersection of Rutland Road South and Robson Road East, is being viewed as a potential hate crime. According to local reports, the Sikh student was involved in an altercation with another teenager, which escalated into a physical assault where he was allegedly kicked, punched, and pepper-sprayed.\n" +
                    "\n" +
                    "The Royal Canadian Mounted Police issued a statement, stating that a 17-year-old Sikh student was either beer or pepper sprayed by another teenage male after disembarking from a public transit bus on his way home. The altercation initially began on the bus itself, leading to the removal of those involved.The Consulate General of India, in a social media post, called for a thorough investigation by Canadian authorities and swift action against the individuals responsible for the assault. Additionally, the World Sikh Organisation of Canada has claimed that the student faced aggression while still on the bus. Allegedly, the two assailants prevented him from boarding, verbally threatened him, and recorded the incident with their phones at close range.\n" +
                    "\n" +
                    "The situation escalated when the attackers physically assaulted the Sikh student in front of the bus driver, who did not intervene and later ordered both the victim and the attackers to disembark at the Rutland and Robson stop. After leaving the bus, the victim faced further violence, including being pepper-sprayed, until bystanders finally stepped in to help.\n" +
                    "\n" +
                    "Guntaas Kaur, Vice-President for British Columbia at the World Sikh Organisation, expressed shock and condemned the incident, labeling it as \"shocking and unacceptable.\" Notably, this incident marks the second occurrence of violence against a Sikh youth on public transit in the city this year."),
            News(R.drawable.img_30,"Iran: Security Forces Seen Across Country As Mahsa Amini's Death Anniversary Nears","Volunteer members of Iran's paramilitary Revolutionary Guard could be seen on the streets on Friday in western Iran as the country neared one year since 22-year-old Mahsa Amini died in police custody, prompting protests that challenged the country's theocratic rule.\n" +
                    "\n" +
                    "In Tehran, Iran's capital, and other cities, the public noticed a heightened presence by police and security forces that went unreported by the country's state-run and semiofficial media.The demonstrations over Amini's death last September 16, following her arrest by the country's morality police for allegedly violating the country's mandatory headscarf law, represented one of the largest challenges to Iran's theocracy since the 1979 Islamic Revolution.\n" +
                    "\n" +
                    "A security force crackdown that followed saw over 500 people killed and more than 22,000 people detained.\n" +
                    "\n" +
                    "Iran's theocracy is trying hard to both ignore Saturday's anniversary  and tamp down on any possibility of more unrest.\n" +
                    "\n" +
                    "Video shared by Hengaw, a Kurdish rights group, showed what the group described as volunteer members of the Revolutionary Guard, known as Basij, in the city of Sanandaj on Friday.\n" +
                    "\n" +
                    "The Associated Press could not immediately verify the videos, though they resembled the wider region around Iran's Kurdistan province, the same area where Amini was buried.\n" +
                    "\n" +
                    "Iran's government, including Supreme Leader Ayatollah Ali Khamenei, have blamed the West for fomenting the unrest, without offering evidence to support the allegation.\n" +
                    "\n" +
                    "However, the protests found fuel in the widespread economic pain that Iran's 80 million people have faced since the collapse of Iran's nuclear deal with world powers after then-President Donald Trump in 2018 unilaterally pulled America from the accord.\n" +
                    "\n" +
                    "International pressure remains high on Iran, even as the administration tries to deescalate tensions with other nations in the region and the West after years of confrontation.\n" +
                    "\n" +
                    "From the White House, President Joe Biden issued a lengthy statement Friday acknowledging the anniversary of Amini's death.\n" +
                    "\n" +
                    "“Jill and I join people around the world in remembering her — and every brave Iranian citizen who has been killed, wounded or imprisoned by the Iranian regime for peacefully demanding democracy and their basic human dignity,” Biden said.\n" +
                    "\n" +
                    "“Iranians alone will determine the fate of their country, but, the United States remains committed to standing with them — including providing tools to support Iranians' ability to advocate for their own future.”\n" +
                    "\n" +
                    "British Foreign Secretary James Cleverly also noted the anniversary as he announced new sanctions targeting Iran's minister of culture and Islamic guidance, as well as Tehran's mayor and a police spokesman.\n" +
                    "\n" +
                    "“A year on from Mahsa Amini's tragic death at the hands of Iran's Morality Police, I commend the bravery of Iranian women as they continue to fight for fundamental freedoms,\" Cleverly said in a statement.\n" +
                    "\n" +
                    "\"Today's sanctions on those responsible for Iran's oppressive laws send a clear message that the UK and our partners will continue to stand with Iranian women and call out the repression it is inflicting on its own people.” "),
            News(R.drawable.img_31," Hunger Crisis: 700 Million People Don't Know When They Will Eat Next, Says UN Food Programme Chief","Owing to a number of complex issues ranging from economy and conflict to climate change, hunger crisis continues to exacerbate across the globe like never before. According to the head of the United Nation's flagship inititiative World Food Programme (WFP), Cindy McCain, today 700 million people in the world don't even know when or if they will eat again. While humanitarian funding is drying up, demand for food is rising relentlessly.\n" +
                    "\n" +
                    "What does the WFP chief say?\n" +
                    "According to McCain, the funding scarcity has compelled the agency to curtail food rations for millions of people, and it has also been told that “more cuts are on the way.”\n" +
                    "\n" +
                    "“We are now living with a series of concurrent and long-term crises that will continue to fuel global humanitarian needs. This is the humanitarian community’s new reality — our new normal — and we will be dealing with the fallout for years to come”, she said.\n" +
                    "\n" +
                    "Findings of WFP: The hunger map in numbers\n" +
                    "As per the agency's estimation, nearly 47 million people in over 50 countries are just one step away from famine while 45 million children under the age of five are now estimated to suffer from acute malnutrition.\n" +
                    "\n" +
                    "According to WFP estimates from 79 countries where the Rome-based agency operates, up to 783 million people — one in 10 of the world’s population — still go to bed hungry every night.\n" +
                    "\n" +
                    "More than 345 million people are facing high levels of food insecurity this year, an increase of almost 200 million people from early 2021 before the COVID-19 pandemic, the agency said.\n" +
                    "\n" +
                    "Money, Conflict, Climate Change: Factors exacerbating the hunger crisis\n" +
                    "Prevalence of hunger and malnutrition is a complex outcome of a long list of socio-economic, environmental and political attributes. Mitigating hunger and eliminating all forms of malnutrition thus requires a multidisciplinary approach which demands serious intervention of the respective governments through policies and leadership. \n" +
                    "\n" +
                    "At the root of the soaring numbers, WFP said, is “a deadly combination of conflict, economic shocks, climate extremes and soaring fertilizer prices.”\n" +
                    "\n" +
                    "The agency also finds the Covid-19 pandemic widely responsible for the aggravating hunger crisis which is closely associated with the resultant economic fallout from the pandemic.\n" +
                    "\n" +
                    "Besides pandemic, the another contributing factor is the war in Ukraine that have pushed food prices out of the reach of millions of people across the world at the same time that high fertilizer prices have caused falling production of maize, rice, soybeans and wheat, the agency said.\n" +
                    "\n" +
                    "“Our collective challenge is to ramp up the ambitious, multi-sectoral partnerships that will enable us to tackle hunger and poverty effectively, and reduce humanitarian needs over the long-term,” McCain urged business leaders at the council meeting focusing on humanitarian public-private partnerships. The aim is not just financing, but also finding innovative solutions to help the world’s neediest.\n" +
                    "\n" +
                    "What do the business leaders say?\n" +
                    "According to Michael Miebach, CEO of Mastercard, the “humanitarian relief has long been the domain of government” and development institutions, and the private sector was seen as a source of financial donations for supplies. However, assuring assistance to mitigate the global hunger issue, Miebach said, “The private sector stands ready to tackle the challenges at hand in partnership with the public sector.”\n" +
                    "\n" +
                    "Miebach stressed that “business cannot succeed in a failing world” and humanitarian crises impact fellow citizens of the world. A business can use its expertise, he said, to strengthen infrastructure, “innovate new approaches and deliver solutions at scale” to improve humanitarian operations.\n" +
                    "\n" +
                    "Jared Cohen, president of global affairs at Goldman Sachs, told the council that the revenue of many multinational companies rivals the GDP of some of the Group of 20 countries with the largest economies. And he said five American companies and many of their global counterparts have over 500,000 workers — more than the population of up to 20 U.N. member nations.\n" +
                    "\n" +
                    "“Today’s global firms have responsibilities to our shareholders, clients, staff, communities, and the rules-based international order that makes it possible for us to do business,” he said.\n" +
                    "\n" +
                    "Cohen said businesses can fulfill those responsibilities during crises first by not scrambling “to reinvent the wheel every time,” but by drawing on institutional memory and partnering with other firms and the public sector.\n" +
                    "\n" +
                    "He said businesses also need “to act with speed and innovate in real time,” use local connections, and bring their expertise to the humanitarian response."),
            News(R.drawable.img_32,"From Golda Meir’s Role To Intelligence Lapses, Declassified Israeli Files Shine Fresh Light On Yom Kippur War","Fifty years after the Yom Kippur War, ‘Golda’, the biopic on the life of the then-Israeli Prime Minister Golda Meir, was screened at the Berlin Film Festival in February for its global premiere. It was commercially released in United States in August. The Times of Israel said that its storyline was how Golda Meir had “navigated the Yom Kippur War”.  \n" +
                    "\n" +
                    "Amid bruising national disputations over judicial reforms, old wounds in Israel’s body politic are being reopened as the country is approaching the 50th anniversary of the Yom Kippur War (October 6-25, 1973). These revelations remind them how their intelligence agencies’ disputes had resulted in conflicting decision-making, leading to the loss of 2,812 Israeli lives.  \n" +
                    "\n" +
                    "The lightening Yom Kippur War started when combined Egyptian-Syrian forces attacked Israel on the ‘Sabbaths of Sabbaths’, the holiest day of the Jewish year when Jews pray for atonement. Even the military takes part in these prayers. After initial shock, Israel ferociously counter-attacked, inflicting heavy losses on the combined Egyptian and Syrian forces. The war ended with a ceasefire on October 25. Israel was clearly the victor. \n" +
                    "\n" +
                    "Despite this commendable success, the surprise attack shocked the country which called for accountability, indicating the strength of their democracy. A judicial enquiry under Chief Justice Shimon Agranat of Israel’s Supreme Court found serious shortcomings in the decision-making leading to the war. As a result, Prime Minister Golda Meir had to resign while Defence Intelligence Chief General Eliyahu Zeria was dismissed.\n" +
                    "\n" +
                    "On September 7, Israel’s Archives published 3,500 files on Yom Kippur War. Many were already released in 2005 under orders from High Court judge Yitzhak Engelard who had reviewed the Agranat Commission report to decide whether the report should be released. These files clearly indicated conflicting assessments. On the one hand, Eliyahu (Eli) Ziera had concluded that the war was not likely to happen till Egypt-Syria upgraded their air force. Conversely this assessment was dramatically followed by Mossad Chief Zvi Zamir’s telegram that “war was a matter of hours”.  \n" +
                    "\n" +
                    "Current Mossad Chief David Barnea also released cables, files, and photos of their star spy ‘The Angel’ on September 7 in the form of a book Some Day, When It Can Be Revealed. The title was taken from what Golda Meir had then told Zvi Zamir: “Someday, when it can be revealed, you and your team will get a prize.” ‘The Angel’ was Ashraf Marwan, son-in-law of the second Egyptian President, the legendary Gamal Abdel Nasser, who had supplied prompt intelligence on the imminence of attack. Earlier Marwan was also known as ‘Babel’ in some records as I had mentioned in my book Intelligence Over Centuries. The released files showed that Zvi Zamir had flown to London to meet Marwan after which he called his senior aide Freddy Eini in Tel Aviv about the imminence of the war. Eini informed Meir. \n" +
                    "\n" +
                    "Agranat Commission report had resulted in drastic changes in Israel’s intelligence adjudication system: Mossad was given equal role as strategic interpreter and assessor of military situations on par with Aman, Israel’s military intelligence. It also recommended that the Ministry of Foreign Affairs should create a research and analysis wing like the US State Department’s intelligence unit to “add a third voice to the debate”. In other words, Israel, like India, started a system of competitive intelligence assessments so that no information slips between “the cracks”. \n" +
                    "\n" +
                    "Why did Mossad reveal the ‘The Angel’ files despite Prime Minister Benjamin Netanyahu’s orders barring declassification of Mossad and Shin Beth (internal intelligence) files before 90 years, as reported by Haaretz Feb 5, 2019? Was it to settle once and for all the controversy surrounding the death of Marwan to prove that they had no role in his killing? Also, that he was not a double agent? Middle East Eye said that Barnea “denied persistent reports that Marwan was in fact a double agent secretly working for Egyptians”. \n" +
                    "\n" +
                    "Marwan’s identity was revealed by the Israeli and Egyptian media in 2002. On June 27, 2007, Marwan fell to his death from his fifth floor apartment in London. He had shifted his residence to London after Sadat’s assassination in 1981. \n" +
                    "\n" +
                    "Marwan’s wife Mona Nasser had persistently told the media that he was killed by Mossad. She told The Guardian on July 11, 2010 from Cairo that he had told her three times before he died: “My life is in danger. I might be killed. I have a lot of different enemies”.\n" +
                    "\n" +
                    "Nasser also said that her husband had told her that he had no direct contact with Israel. At the same time, she learnt from some Egyptian intelligence officers that Marwan was feeding false information to Israel. After death, Marwan was treated as Egypt’s hero, although rumours that Egyptian intelligence might have killed him for betrayal were also strong. "),
            News(R.drawable.img_33," Seattle Police Officer, Who Joked About Indian Student's Death, Has History Of Racial Violence While On Duty",""),
            News(R.drawable.img_34," Pakistan Enhances Nuclear Arsenal, Says Report - Where Do They Keep The Nukes?","Amid outrage over the death of an Indian student Jaahnavi Kandula in Seattle, wherein bodycam footage emerged of a police officer joking about her accident, a Seattle-based police watchdog group has alleged that the concerned officer had a history of racial violence while on duty.\n" +
                    "\n" +
                    "Kandula, 23, was struck by a police vehicle driven by Officer Kevin Dave when she was crossing a street on January 23. He was driving 74 mph (more than 119 kmh) on the way to a report of a drug overdose call. In bodycam footage released on Monday by the Seattle Police Department, Officer Daniel Auderer laughed about the deadly crash and dismissed any implication Dave might be at fault or that a criminal investigation was necessary.\n" +
                    "\n" +
                    "Divest SPD, a Seattle-based police watchdog group, revealed in a series of social media posts, that Daniel Auderer has been the subject of eighteen Office of Public Accountability (OPA) investigations since 2014 and involved in lawsuits costing the city over \$1.7 million. In 2010, Auderer and several other officers illegally stopped, harassed and arrested two Mexican immigrants, Divest SPD said.\n" +
                    "\n" +
                    "In 2017, Auderer punched and choked a homeless man inside the ER at Harborview Hospital. He was earlier suspended for four days after conducting an illegal off duty arrest. All of these investigations cost the city over \$2,000,000 in lawsuits, Divest SPD said.\n" +
                    "\n" +
                    "In the video, Daniel Auderer, who is captured on body camera while discussing the fatal collision, can be heard saying, \"Yeah, just write a check. USD 11,000. She was 26 anyway, she had limited value.\" The Indian consulate in San Francisco has demanded strong action from the US and urged them to conduct a comprehensive investigation.\n" +
                    "\n" +
                    "Meanwhile, more than 200 people from different communities held a rally in Seattle demanding justice for the Indian student and resignation of the police officers. Speakers at the rally criticised the police system, saying it is built on white supremacy, and the criminalising and undervaluing of the lives of Black and Indigenous people and other people of colour, the Seattle Times newspaper reported.\n" +
                    "\n" +
                    "The Seattle Police Department has previously been accused of unprovoked violence, especially during the protests after George Floyd's killing by Minneapolis police in 2020. \n" +
                    "\n" +
                    "According to a Washington Post analysis from that year, half of people killed by police are white, but Black Americans are shot at a disproportionate rate. They account for less than 13 percent of the U.S. population but are killed by police at over twice the rate of white Americans, the newspaper analysis found.\n" +
                    "\n"),
            News(R.drawable.img_35,"Italy Migrant Bus Crash Claims Two Lives, Injures Others","A bus reportedly transporting recently arrived migrants slammed into a truck north of Rome early Friday, killing the two drivers, as Italy accelerated the transfers of migrants north to try to relieve pressure on the Sicilian island of Lampedusa.\n" +
                    "\n" +
                    "Ten other people were injured in the crash on the A1 highway near Fiano Romano, Italy’s fire rescue service said. Italian media said the bus had been transporting the migrants north to Piedmont after they arrived in recent days on Lampedusa and were ferried to the Italian mainland.\n" +
                    "\n" +
                    "Lampedusa, which is closer to Africa than the Italian mainland, has been overwhelmed this week by thousands of people hoping to reach Europe from Tunisia, which has replaced Libya as the main base of operations for migrant smuggling operations in the Mediterranean.\n" +
                    "\n" +
                    "The Italian Red Cross said some 700 new arrivals had been transferred off Lampedusa on Thursday and 2,500 more transfers were planned for Friday to try to relieve pressure on the island’s refugee centre, which has a normal capacity of around 400 people. As of Friday morning, the centre was hosting some 3,800 people, down significantly from the over 6,000 registered this week, the Red Cross said in a statement.\n" +
                    "\n" +
                    "The influx has occurred despite a European Union-inked accord with the Tunisian government to stem the smuggling operations in exchange for economic assistance.\n" +
                    "\n" +
                    "The arrivals have put pressure on the right-wing government of Premier Giorgia Meloni, who took office last year promising to crack down on migration, ahead of European Parliament elections next year. Meloni’s conservative coalition partner, the League Party, has increased criticism of Meloni and the EU-Tunisia deal, saying the influx of migrants showed it clearly had failed.\n" +
                    "\n" +
                    "According to Interior Ministry statistics, nearly 1,26,000 people have arrived in Italy so far by boat this year compared to 66,000 last year and 42,000 in 2021. If the trend continues, this year could be on track to near the record in 2016, when by the end of September, some 1,32,000 migrants had arrived. The year 2016 holds the recent record for migrant sea arrivals with a total of 181,000 people. "),
            News(R.drawable.img_36,"NASA Study Does Not Find Proof Of Aliens In Unclassfied Data, Appoints Director To Study UAPs Better","An independent study commissioned by the US National Aeronautics and Space Administration (NASA) has found no proof of unidentified anomalous phenomenon (UAP) in the public domain having extraterrestrial origin. \n" +
                    "\n" +
                    "After the publication of the study, carried out by a panel of 16 experts outside of NASA, the US space agency appointed a new director to study the UAPs better in line with the panel's suggestions. The UAPs were earlier called unidentified flying objects (UFOs) in the United States. The new director of UAP research at NASA is Mark McInerney.\n" +
                    "The NASA describes a UAP as an observation of events in the sky that cannot be identified as aircraft or known natural phenomena. \n" +
                    "\n" +
                    "\"To date, in the peer-reviewed scientific literature, there is no conclusive evidence suggesting an extraterrestrial origin for UAP. When it comes to UAP, the challenge we have is that the data needed to explain these anomalous sightings often do not exist; this includes eyewitness reports, which on their own can be interesting and compelling, but aren’t reproducible and usually lack the information needed to make any definitive conclusions about a phenomenon’s provenance,\" says the study. \n" +
                    "\n" +
                    "The study, however, has a major limitation as it is based on unclassified data. For decades, former government officials and independent researchers have claimed that the US government is in posession of classified information related to extraterrestrial —alient— aircraft and even creatures. Such claims have found increased traction in recent years as a consistent trickle of information from the classified realm has come into the public domain. \n" +
                    "\n" +
                    "In January, it emerged that the US government has 510 UAP sightings and 144 of those are unexplained. \n" +
                    "\n" +
                    "Over the years, there have been several sightings of unexplained UAPs and some of the most notable ones have been from elements within the US military. For example, in 2014, US figher pilots tracked 'tic tac' UAP, which are called so because those flying objects were shaped like tic tac pills. They were very fast and remain unexplained. There is also the case of a mysterious orb flying over Iraq. \n" +
                    "\n" +
                    "In 2020, some of the UAP videos were released by the US government. About the video below, Guardian notes, \"One of the videos shows an incident from 2004, and the other two were recorded in January 2015. The videos became public after unauthorised leaks in 2007 and 2017, and the Navy previously verified their authenticity.\""),
            News(R.drawable.img_37,"In Pictures: Protest Erupts In Seattle Over Indian Student Jaahnavi Kandula's Death","Kyla Carrillo, center, leads a chant on the steps of the Seattle Police Department's West Precinct as people protest after body camera footage was released of a Seattle police officer joking about the death of Jaahnavi Kandula," +
                    " a 23-year-old woman hit and killed in January by officer Kevin Dave in a police cruiser in Seattle.Layla Allibhai, 5, sits atop father Mo Allibhai's shoulders while holding a sign for Jaahnavi Kandula, a 23-year-old woman hit and killed in January by officer Kevin Dave in a police cruiser, as people protest after body camera footage was released of a Seattle police officer joking about Kandula's death in Seattle." +
                    "Protesters march through downtown Seattle after body camera footage was released of a Seattle police officer joking about the death of Jaahnavi Kandula, a 23-year-old woman hit and killed in January by officer Kevin Dave in a police cruiser in Seattle.Protesters march after body camera footage was released of a Seattle police officer joking about the death of Jaahnavi Kandula, a 23-year-old woman hit and killed in January by officer Kevin Dave in a police cruiser in Seattle." +
                    "A protester holds a sign calling for the conviction of Seattle Police officer Kevin Dave, who hit and killed Jaahnavi Kandula while driving a police cruiser in January, as people protest after body camera footage was released of a Seattle police officer joking about Kandula's death, outside the Seattle Police Department's West Precinct in Seattle.")

        )

        val adapter = RVAdapterinternational(news_data)
        recyclerView.adapter = adapter
    }
}