package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class All: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.rvitems)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val news_data = listOf(
            News(R.drawable.img_11,"TikTok will become bigger","As more people bookmark TikTok, the short video app is expected to surpass YouTube, by the end of the year, for the first time in terms of time spent by their respective adult users in the U.S., according to a report released on eMarketer last week.\n" +
                    "\n" +
                    "The report indicates that TikTok users will spend an average of 45.8 minutes per day on the video-sharing platform, in contrast to the 45.6 minutes they'll tune into YouTube. Despite emulating TikTok with short-video features like Instagram Reels, Instagram accounts for an average of 30.1 minutes per day. \n" +
                    "\n" +
                    "The difference between those stats on YouTube versus TikTok may be negligible, but it harbingers a turning of the tide. And for business owners, the ByteDance-owned app has huge potential to engage new consumers. 1. Be authentic.\n" +
                    "You'll hear this a lot in reference to TikTok: In many ways, TikTok and Instagram are polar opposites. Whereas picture perfect tends to rule the day on Instagram, TikTok users, rather, crave authenticity. So on TikTok, don't sugercoat, and stick to videos that can spark an emotion in the viewer. 2. Don't jump on every big trend.\n" +
                    "While you should attempt to post regularly about your products--and do so in a consistent manner--avoid jumping on every hot topic, which can range wildly from cute dog videos one minute to the \"I am not meant to work\" trend the next. Consider whether a trend is a fit with your business. A party outfit trend, for instance, may not be suitable for an energy saving company's marketing campaign.3. Embrace \"live\" interactions.\n" +
                    "Last week, TikTok announced it will test out a new function, dubbed TikTok Live, to allow creators to generate recurring revenue via payments through livestreaming. In a statement, TikTok says that the function aims to bring brands and viewers closer."),
            News(R.drawable.img_12,"Video content will continue to dominate","Video content is becoming (if it already hasn’t) the dominant force in online co ..\n" +
                    "\n" +
                    "Read more at:\n" +
                    "https://brandequity.economictimes.indiatimes.com/news/advertising/five-reasons-why-video-content-will-dominate-the-advertising-industry-for-the-next-decade/741577705G - New data standard: 5G connectivity and speed of > 1GBPS ..\n" +
                    "\n" +
                    "Read more at:\n" +
                    "https://brandequity.economictimes.indiatimes.com/news/advertising/five-reasons-why-video-content-will-dominate-the-advertising-industry-for-the-next-decade/74157770ugmented Reality/Virtual Reality: Though not new formats, AR/VR ..\n" +
                    "\n" +
                    "Read more at:\n" +
                    "https://brandequity.economictimes.indiatimes.com/news/advertising/five-reasons-why-video-content-will-dominate-the-advertising-industry-for-the-next-decade/74157770Video wave: All major platforms like Facebook, Instagram, Youtu ..\n" +
                    "\n" +
                    "Read more at:\n" +
                    "https://brandequity.economictimes.indiatimes.com/news/advertising/five-reasons-why-video-content-will-dominate-the-advertising-industry-for-the-next-decade/74157770"),
            News(R.drawable.img_13," Social commerce will continue to expand","Social commerce falls under the larger ecommerce umbrella, and refers to when a consumer’s shopping experience occurs directly on a social media platform. It can also include clicking links on a social network that lead to a retailer’s product page with an immediate purchase option. \n" +
                    "\n" +
                    "While social buying is a growing trend in the US, it’s more popular in China and Russia, where 51.5% and 49.5% of social network users have purchased via a social channel.\n" +
                    "\n" +
                    "We project social commerce will be a \$79.64 billion industry in the US by 2025. While that’s a lofty figure, marketers have a long way to go if they plan on catching up with China’s success.Social commerce marketing strategies for brands\n" +
                    "No one marketing strategy is going to work for every brand—a social shopping experience for athleisure is going to look very different from a campaign for electronics. However, all brands can utilize influencers, consumer calls to action, and user generated content, to successfully compete in the social commerce market. \n" +
                    "\n" +
                    "Phrases such as “swipe up to purchase,” or “store link in bio,” have become extremely popular calls to action—pushing social media users to purchase the items or services they see advertised on their newsfeeds. \n" +
                    "\n" +
                    "User-generated content has risen in importance for marketers—with TikTok videos and hashtag challenges providing value for brands. This viewer-friendly content combined with appropriate call to action steps has been a boon for advertisers and marketers alike. In addition to these organic opportunities, companies should keep influencers top of mind when planning their social commerce strategy.\n" +
                    "\n" +
                    "In 2019, Instagram gave some influencers the ability to create shoppable posts using Checkout on Instagram, while Snapchat gave select top-tier influencers a “shop” button. And even TikTok has tapped the social commerce market—announcing its partnership with Shopify in November 2020. \n" +
                    "\n" +
                    "According to a September 2020 GlobalWebIndex survey, 70% of internet users in the US who regularly watched influencer-led livestreams said they were likely to buy products recommended by those influencers. Overall, we forecast US spending on influencer marketing will reach \$4.14 billion this year.\n" +
                    "\n" +
                    "Like what you’re reading? Click here to learn more about Insider Intelligence’s leading Ecommerce and Retail research."),
            News(R.drawable.img_14," Augmented reality will go mainstream","It was in 1955 when the American philosopher, inventor, film director, and cinematographer Morton Heilig released a paper entitled \"The Cinema of the Future.” In the paper, he described an immersive multisensory machine, or Experience Theatre as he dubbed it, that included a stereoscopic collar display, a story-sound system, fans, odour emitters, and a motional chair.\n" +
                    "\n" +
                    "The Sensorama, as it was called, and for which he received a patent, was a 5D personalised movie theatre avant la lettre. Spectators were treated to an imaginary motorcycle ride through New York City. They would experience the city as it was in real life, with simulated noises and smells of people, cars and pizza, and fan-generated wind. Unfortunately, the invention was far too early for society, and Heilig failed to achieve financial backing for his invention, so the Sensorama never made it to the masses. Due to his work, Morton Heilig is considered the father of virtual reality.\n" +
                    "\n" +
                    "Since then, virtual reality has been promised a breakthrough technology many times but never really managed to achieve what was promised. The same applies to the other immersive technology, augmented reality.\n" +
                    "\n" +
                    "For many years, these technologies have been over-promised and under-delivered. The devices were too bulky and uncomfortable; the graphics were mediocre, to say the least; the experience made people nauseous (especially with virtual reality); and the hardware was too expensive. It was far from the seamless experience required for a technology to go mainstream. Over the past years, we have seen a wide range of new augmented reality (AR) and virtual reality (VR) headsets enter the market, targeting both the lower-end consumer and high-end enterprise markets.\n" +
                    "\n" +
                    "With the hype of the metaverse, especially virtual reality has returned to the limelight, and many think virtual reality equals the metaverse. However, while virtual reality offers an immersive experience, it is certainly not the only technology that will enable the metaverse. The other is, of course, augmented reality, which saw its mainstream adoption in 2016 with Niantic’s Pokémon Go’s Gotta Catch ’Em All!"),
            News(R.drawable.img_15," Influencer marketing continues to rise","In today’s digitally connected world, social media platforms have become more than just channels for communication and entertainment. They have evolved into thriving marketplaces where brands and businesses can tap into a vast pool of potential customers. One of the most effective strategies emerging from this digital revolution is influencer marketing. In this blog post, we will explore the power and potential of influencer marketing and how it has revolutionized the way brands connect with their target audiences.The Rise of Influencer Marketing\n" +
                    "Influencer marketing has gained tremendous popularity in recent years due to the significant impact influencers have on their followers. These individuals, known as influencers, have cultivated a loyal and engaged following by sharing their expertise, experiences, and opinions across various social media platforms. From lifestyle and fashion to technology and gaming, influencers cover a wide range of niches, catering to specific audience segments.The Impact of Influencer Marketing\n" +
                    "Influencer marketing has proven to be highly effective in reaching and engaging target audiences. Unlike traditional advertising, influencer marketing allows brands to leverage the trust and credibility influencers have built with their followers. When an influencer endorses a product or service, their followers perceive it as a genuine recommendation, leading to increased brand awareness, credibility, and ultimately, sales.\n" +
                    "\n" +
                    "Moreover, influencer marketing enables brands to access highly targeted audiences. By partnering with influencers whose followers align with their target demographic, businesses can ensure their message reaches the right people, maximizing their chances of converting followers into customers.\n" +
                    "\n" +
                    "Building Authentic Connections \n" +
                    "One of the key advantages of influencer marketing is the ability to build authentic connections with consumers. Influencers are experts at creating engaging content that resonates with their audience. They understand their followers’ preferences, needs, and aspirations, allowing them to craft compelling narratives around a brand or product.\n" +
                    "\n" +
                    "Through influencer collaborations, brands can humanize their image and connect with customers on a more personal level. This authenticity fosters trust and loyalty, resulting in long-term customer relationships.\n" +
                    "\n" +
                    "Measuring and Optimizing Results \n" +
                    "Another advantage of influencer marketing is the ability to measure and optimize campaign performance. Social media platforms provide in-depth analytics that allow brands to track key metrics such as reach, engagement, and conversions. This data enables businesses to assess the success of their campaigns and make data-driven decisions for future collaborations.\n" +
                    "\n" +
                    "By analyzing the performance of different influencers, brands can identify top-performing partners and refine their strategy accordingly. They can also adapt their messaging and creative elements based on the insights gained from campaign analytics, ensuring continuous improvement and maximum return on investment.\n" +
                    "\n" +
                    "Conclusion\n" +
                    "Influencer marketing has emerged as a powerful tool for brands to connect with their target audiences authentically. By leveraging the trust, credibility, and influence of social media personalities, businesses can reach highly engaged audiences, build authentic connections, and drive conversions. With the ability to measure and optimize campaign performance, influencer marketing offers a cost-effective and results-driven approach for brands seeking to make a lasting impact in the digital age. As the influence of social media continues to grow, harnessing the power of influencer marketing will remain a vital strategy for businesses striving to stay relevant and connect with their customers in a meaningful way."),
            News(R.drawable.img_16," Customer service becomes a big part of social media","Building relations with customers via social media and the way these channels are managed is an essential element of the brand’s success. Social Media can positively influence sales and to a large extent brand loyalty and connection.\n" +
                    "\n" +
                    "And although social media was initially used primarily for personal use and to maintain personal interactions, with their development and growing popularity they’ve become a valuable tool to build a community around brands.\n" +
                    "\n" +
                    "Here we’re going to discuss the importance of Social Media in driving customer service. We’ll give you a quick take away answer here, then dive into more details…\n" +
                    "\n" +
                    "What is the role of social media in customer service? The use of social media plays a significant role in customer service. The mutual benefits of easy brand accessibility via Twitter, Facebook, YouTube, and others allow easy customer contact and engaging social interaction, providing brand building and widescale contact through multiple channels.\n" +
                    "\n" +
                    "From an entrepreneur’s perspective, it saves a lot of time and money. In addition, the use of social networking sites allows you to reach a much wider group of customers than using traditional methods.\n" +
                    "\n" +
                    "This form of contact is extremely convenient for customers as it taps into their social network and social time, it allows for quick contact with the customer service department, without the need to make endless inconvenient phone calls.\n" +
                    "\n" +
                    "It’s worth it for a business to use numerous social media channels at the same time to provide customers with the freedom to choose their preferred form of contact.\n" +
                    "\n" +
                    "Thanks to the ability to speak directly with brands via social media channels, it means many customers feel “closer” to the brand and therefore can emotionally connect and invest in it.\n" +
                    "\n" +
                    "Plus, they’re more likely to use this form of contact that’s molded around their daily lifestyles, which also ensures greater and flexible accessibility. Using such a solution will not only increase the effectiveness of activities in this area but will also have a positive impact on the company’s image for convenience and social interaction.\n" +
                    "\n" +
                    "Social media and the culture of customer service\n" +
                    "Implementing a social media strategy in your customer service model will give you a chance to communicate with consumers at a level that ensures they feel part of your story, and encourages them to recommend your brand to others.\n" +
                    "\n" +
                    "One of the main changes that must be made in order to implement an effective customer service strategy is a change in your “corporate” way of thinking. Customer service should not be limited to immediate patching of holes and solving new problems – but should consist of reaching out, anticipating the needs of customers before they’re even aware they have a need.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Below are a few elements that will help you integrate your company with the social media customer service standard.\n" +
                    "\n" +
                    "Activate internal communication channels – The more complex the structure of your company, the harder it is for employees to understand how their roles and tasks affect the whole company and the customer. Increasing openness in communication between people employed in your company will help them better appreciate their place in the organization and better understand the problems they’re supposed to solve. Therefore, it’s worthwhile to keep employees constantly informed about what also applies to other activities than those that fall within the scope of their duties. This can be done in the form of meetings and/or short and concise internal newsletters.\n" +
                    "Build employee value and trust – Conducting business and customer-oriented communication requires the company to trust its employees. If you believe that an employee is able to represent the brand and to provide a consumer-oriented, competent service. Then as management, you should show this trust by enabling employees to speak on behalf of the company and introduce some freedom in building relationships with customers.\n" +
                    "Share feedback – One of the key methods to understand customer needs and where they’re coming from is to share consumer feedback with relevant departments in your company. It’s best practice to create complementary statements, complaints or brand suggestions and share them with the people working in the company. What’s more, it’s also worth providing a gateway for employees and departments who might have an idea for solving a given problem. In this way, all employees have a chance to get to know the customer and their needs better."),
            News(R.drawable.img_17,"Local targeting will grow","Content marketing, particularly of the digital variety, has become an increasingly popular item in modern marketers’ toolboxes.\n" +
                    "\n" +
                    "While many larger organizations have been quick to embrace content marketing strategies, smaller local businesses often underestimate its potential or remain unsure about its relevance to their operations.\n" +
                    "\n" +
                    "This is particularly true considering the level of effort and time it has traditionally taken to produce content in its many forms; from blogs and social posts to podcasts and videos.\n" +
                    "\nSmall business owners and managers may be unsure of content’s value and the return it will provide.\n" +
                    "\n" +
                    "They may be asking questions like, “Who has the time or wants to read, watch, or listen to my content?”\n" +
                    "\n" +
                    "However, as consumer behavior and search engine algorithms continue to evolve, content marketing, when done correctly and purposefully, can be an indispensable aspect of a local business’s overall success.\n" +
                    "\n" +
                    "Unique, relevant, entertaining content can set a local business apart from its other small local or big box competitors.\n" +
                    "\n" +
                    "Let’s delve into the reasons why a content marketing strategy is crucial for local businesses and consider a few practical tips on how to implement effective content marketing strategies to boost brand awareness, establish online authority, engage customers, and drive business growth."),
            News(R.drawable.img_18,"AI will assist with content creation","There’s a lot of buzz around AI content creation, but you’re still probably a little skeptical of using AI content creation tools.\n" +
                    "\n" +
                    "What if the quality of AI-generated content isn’t up to standards? What if the AI content doesn’t match your tone and style? The truth is, it all boils down to how you use the tools to give you the best output and choose the right ones for your use cases.\n" +
                    "\n" +
                    "AI content creation tools can boost your content team’s productivity multi-folds and help you scale content production to meet rising demands. But the biggest dilemma is finding the right tool to meet your needs.\n" +
                    "\n" +
                    "Trust us, once you’ve found the right AI content creation tools to add to your arsenal, you will never think of going back to the conventional ways of creating content. According to the State of AI in the Enterprise Report, 94% of business leaders believe AI is critical for success. Content creation teams can expect to boost productivity, depending on how deeply they are able to embed AI into content creation, and the returns on this investment are immediately evident and impressive.\n" +
                    "\n" +
                    "So, if you’re looking for an AI content creation tool that ticks all the boxes for you and can boost content creation speeds and efficiency without compromising on quality, this guide is just for you.\n" +
                    "\n" +
                    "What are AI Content Creation Tools?\n" +
                    "AI content creation tools use artificial intelligence technology to generate written or visual content based on text prompts. It can create content like articles, social media posts, product descriptions, and even videos without the need for human intervention. \n" +
                    "\n" +
                    "Specifically, these AI content creation tools are trained using natural language processing and machine learning algorithms to analyze data and generate relevant and engaging content.\n" +
                    "\n" +
                    "The end goal for a lot of these tools is to help minimize the time, effort, and resources spent on content creation"),
            News(R.drawable.img_19,"Social audios will gain popularity","Earlier this year, we discussed how Clubhouse will be the next big thing, but the spotlight now is not only on Clubhouse but also on the entire audio-based social media concept. The growing audience on platforms like Clubhouse and Discord—as well as with major social platforms like Twitter introducing their own audio space (Twitter Spaces)—makes it seem like audio-based social media is here to stay. And with the world moving into the \"new normal,\" it is likely to be the next big thing!\n" +
                    "\n" +
                    "The introduction of audio in social media \n" +
                    "\n" +
                    "Communicating through technology is coming full circle. With multiple waves of the pandemic and a majority of businesses functioning virtually, people have actually grown fatigued of Zoom and other kinds of virtual web conferencing tools. As people seek a way to overcome this fatigue, they are connecting via voice again, whether through phone calls or voice texts. It seems like we're tired of virtual meetups, and voice is making us feel intimate and close again.\n" +
                    "\n" +
                    "Audio messaging has been available for years through products like WhatsApp voice notes. For countries like India that have a wider audience for WhatsApp audio, Twitter Spaces is quickly gaining popularity. These audio-social platforms allow you to hop in and join a conversation that interests you without having to scroll or stare at a screen.\n" +
                    "\n" +
                    "It takes the concept of a podcast to the next level. Imagine listening to a podcast about something that really interests you and wishing you could chime in and share your thoughts on that topic in a live session. The skyrocketing usage of audio-based social media is giving birth to a lot of hip tools like Clubhouse, Discord, Swell, Twitter spaces, and others.\n" +
                    "\n" +
                    "The key players of audio-based social networks \n" +
                    "\n" +
                    "Let's take a brief look at some of the key players with an established user base in 2021.\n" +
                    "\n" +
                    "Clubhouse \n" +
                    "\n" +
                    "In spite of still being an iOS-only beta app, Clubhouse is one of the major players and has been enjoying exponential growth since 2020 with over 10 million users as of April. One of its main draws is the presence of a lot of celebrities, from Elon Musk to Ashton Kutcher, who are either silent listeners or chairing sessions. Its popularity has made it the leading player in this space. We took a closer look at Clubhouse in our recent article."),
            News(R.drawable.img_20,"Mapping violence – from J&K to Northeast","NAGPUR: The country has never been as peaceful before and the credit goes to PM Narendra Modi’s government that has reduced violence by 80%, including terrorism in Kashmir, Maoist insurrection, and insurgency in the Northeast, Union home minister Amit Shah said Saturday in a riposte to the opposition that had questioned several initiatives and policies.\n" +
                    "“During debates in Parliament after revocation of Article 370, the opposition used to say that there would be a bloodbath in the troubled state. We have not only stopped the spilling of blood but also incidents of stone pelting and protests. Over 1.8 crore tourists visited J&K last year,” Shah said at an event marking 50 years of Lokmat’s Nagpur edition.\n" +
                    "Targeting Rahul Gandhi, the Union minister said Congress MP had sought removal of AFSPA (the 1958 law that gives special powers to soldiers during counter-insurgency/terrorism ops), “but we told him that until peace prevailed in the NE region, we will not do it”."),
            News(R.drawable.img_21,"Can’t prosecute journalists for false reports","Calling an NGO’s complaint against three Editors Guild members a “counter-narrative of the government”, a CJI-led bench said the FIRs lodged against them did not “reveal even a whisper” of the offences alleged in the complaint.\n" +
                    "The Meitei NGO, which had lodged the FIRs against the EGI members, opposed the journalists’ plea for revoking the FIRs alleging that the report was full of falsehoods propagated by the Kuki side, which deepened the ethnic divide and fuelled violence. The bench of\n" +
                    "CJI DY Chandrachud and Justices JB Pardiwala and Manoj Misra said even if the report was false, journalists could not be prosecuted under Section 153A.\n" +
                    "“Assuming that the EGI report is false, it is not an offence under Section 153A. There are falsehoods in articles published across the country every day, do we prosecute all journalists under Section 153A?” the CJI said. Section 153A penalises “promoting enmity between different groups on grounds of religion, race, place of birth, residence, language etc, and doing acts prejudicial to maintenance of harmony”.\n" +
                    "The CJI also questioned how ingredients of Section 200 of IPC invoked against the EGI members in the FIR were made out from the NGO’s complaint. “How was the report a declaration to the court? How is an offence under Section 200 made out? Read your complaint,” he asked. Section 200 says “whoever corruptly uses or attempts to use as true any such declaration, knowing the same to be false in any material point, shall be punished in the same manner as if he gave false evidence”.\n" +
                    "Solicitor general Tushar Mehta said, “The Manipur government is not concerned with all these. My only worry is any organisation now can put up a fact-finding committee, file a report and place it alongside the counter views and then come before the SC seeking quashing of the FIR. With this (kind of report), we may not be able to control the narrative-building by both sides.”\n" +
                    "The CJI said, “The Army wrote to the EGI and complained of biased or one-sided reporting of the ethnic violence. The Army invited them. They went to the ground and submitted a report.”\n" +
                    "During the hearing, EGI counsel Shyam Divan informed the SC about the Manipur HC chief justice entertaining a PIL against the EGI report and sending notices seeking response of the journalists on the plea for discarding the report. The bench ticked off the HC chief justice, saying, “The manner in which the PIL is entertained by the chief justice of Manipur HC, as head of the family... there are better cases to take up than these kinds of PILs.”\n" +
                    "The bench asked the Meitei NGO’s counsel Guru Krishna Kumar to file its response to the EGI’s plea for quashing of the FIR after Divan repeatedly said that lodging of FIRs had a chilling effect on free speech of journalists.\n" +
                    "He also flagged the Manipur CM holding a press conference to defend lodging of FIRs against the journalists. Kumar attempted to salvage the situation by suggesting that the NGO would withdraw the police complaint if the EGI withdrew its report. Divan said the EGI had put comments for and against the report alongside it in the same weblink for people to frame their views. The SC asked the NGO to file a response by Friday, when the matter will be taken up for further hearing."),
            News(R.drawable.img_22,"  Why ‘pharmacy of the world’ is buying drugs for Nipah","Hailed as the “pharmacy of the world”, the booming pharmaceutical industry of India is a leading source of path-breaking innovation especially when it comes to providing life-saving medicines at affordable prices to countries that need them the most. Even during the COVID-19 pandemic, the world continued to depend on Indian vaccine and pharmaceutical manufacturers to get their supply of medications.\nAs per data, India exported 5.84 crore doses of COVID vaccines to 70 countries as of March 2021. With low-cost skilled manpower and a well-established manufacturing base, India is all set to play even a bigger role in worldwide drug security and continues to be one of the most favoured pharmaceutical markets in the worldWhat Led to India’s Emergence as the “Pharmacy of the World”?\n" +
                    "Product patents on medicines were not granted in India before 2005. As a result, Indian pharmaceutical manufacturers were able to produce low-cost generic versions of drugs that had patents from other countries. With the help of reverse engineering, India was the first to bring to the market affordable versions of the HIV drugs (Zidovudine) and life-saving cancer (Imatinib) within a few years after their US launch."),
            News(R.drawable.img_23," After malaria and dengue, a reference to potassium cyanide","Cases on concurrent infection of dengue and malaria are uncommon in Pakistan. Dengue and malaria are the two very common, mosquito-borne infections, which may have significant morbidity and mortality if not managed properly. Concurrent infections of dengue and malaria are rare due to the different habitats of its vectors and activities of different bearer mosquitoes. The first case was reported in 2005. Since then, several co-existing infections have been reported consisting of the dengue virus (DENV) and the malaria protozoans. Symptoms of each infection may be disguised by a coincident second infection, resulting in delayed treatment and severe complications. We report a case of concurrent malaria and dengue viral hemorrhagic fever in a 19-year-old male.Introduction\n" +
                    "Several tropical vector-borne infections continue to cause a rising incidence of morbidity and mortality in resource-restricted nations. Two of those infections are: a parasitic disease malaria and a viral disease dengue. Malaria is caused by a female mosquito, Anopheles; while dengue is caused by Aedes aegypti mosquito. In the past, the presence of a co-infection in an individual is sporadically reported [1, 2]. Both of the diseases cause an acute pyrexial illness; however, only malaria can cause a chronic fever. Here, we present a case of a young male with overlapping symptoms and the challenging enigma of diagnosis to aware physicians in the endemic areas of Pakistan for the possibility of malaria and dengue co-infection.Case presentation\n" +
                    "A 19-year-old male, a resident of Mirpur with no known co-morbidities, presented to the emergency department (ED) of Dr. Ruth KM Pfau, Civil Hospital Karachi (CHK) in September 2018 with a history of fever, dizziness, generalized weakness and bleeding of gums since the past three days. According to the patient, he suddenly developed a continuous fever of 102°F, which was sporadic in nature and associated with chills and rigors. The fever temporarily alleviated with intake of antipyretics. He also experienced occasional bleeding from gums and dizziness with generalized weakness, for which he sought symptomatic treatment from a local health care facility, but the symptoms worsened. Therefore, he was then referred to CHK. No history of bleeding from any other site, nor hematemesis or black tarry stools was present. The patient revealed a decreased appetite and past addiction to tobacco.\n" +
                    "\n" +
                    "On examination (O/E), the patient was of average height and built, comfortably lying on the bed, and well oriented to time, place and person. Initial vitals included blood pressure (BP) 120/70 mmHg, a regular pulse of 90 beats/min and a respiratory rate of 20 breaths/min. The patient was anemic and dehydrated. He had a soft, non-tender, non-distended abdomen without hepatosplenomegaly, and bowel sounds were audible with a rate of 3-4/min. All other systems were unremarkable.\n" +
                    "\n" +
                    "Blood investigations revealed a hemoglobin (Hb) of 4.5 gm/dl, mean corpuscular volume (MCV) of 108.5 fl, mean corpuscular hemoglobin concentration (MCHC) of 35.4 gm/dl, total leukocyte count (TLC) of 2.7 x 109 L, hematocrit (HCT) of 12.7%, platelet count (PLT) of 12 x 109/L. The clotting profile showed an international normalized ratio (INR) of 1.11, while prothrombin time (PT) and activated partial thromboplastin time (aPTT) were 11.1 and 21.7 seconds, respectively. The various lab investigations conducted, including those for hepatitis B surface antigen and hepatitis C antibody, both came out normal, as did his X-ray chest, renal and liver function tests, spot urine examination and ultrasound of the abdomen. The need for conducting specific investigations like hepatitis and chest X-ray were to exclude any other likely cause of the fever and presence of an infection. The electrolytes were within the normal range as well. Upon serology testing, dengue antigen came out to be reactive while that of dengue virus-specific antibodies, immunoglobulin M (IgM) and immunoglobulin G (IgG), were not reactive. Malarial parasite (MP) and MP immunochromatographic test (ICT) came out to be positive for Plasmodium (P) vivax with 7% reticulocytes (RET). Therefore, a diagnosis of concurrent malaria and dengue infection was established.\n" +
                    "\n" +
                    "The patient was treated with an oral combination of artemether and lumefantrine 80/480 twice daily for three days, along with oral acetaminophen two tablets if needed. Additionally, he was intravenously (IV) given tranexamic acid 5 mg when necessary and 1000 ml sodium chloride at the rate of 80 ml/hour. Two units of packed cells and six units of platelets were transfused alongside. Malaria and dengue were treated as separate entities with the above-mentioned treatment."),
            News(R.drawable.img_24," A capability boost for IAF, Navy amid China-Pak threat","NEW DELHI: There is a shortage of more than 11,000 officers in the Indian Army, Air Force and Navy of which more than half are in the Army, officials in the Defence Ministry have said. According to the Defence Ministry, there is a shortage of officers of the rank of Major and Captain. At the same time, the Indian Air Force is short of important officers like the Squadron Leader and Flight Lieutenant. Similarly, there is a shortage of officers in the Indian Navy, including officers of the rank of Lieutenant Commander.\n" +
                    "\n" +
                    "Regarding these vacant posts, the Ministry of Defence says that there was low recruitment of officers during the Covid-19 pandemic. According to the Defence Ministry, due to the low recruitment of officers in the Covid-19 period, there has been a shortage of 11,266 Major and Captain and equivalent ranks and other rank officers in the Indian Air Force and the Navy alsoThe Ministry of Defence informed Parliament in writing that the posts of more than 6,800 officers are lying vacant in the Indian Army. The Army is short of 2,094 Major-level officers and 4,734 Captain-level officers. On the other hand, there is a shortage of 881 Squadron Leaders and 940 Flight Lieutenants in the Indian Air Force.\n" +
                    "\n" +
                    "The Navy has a shortfall of 2,617 officers of the rank of Lieutenant Commander and below ranks. According to Minister of State for Defence Ajay Bhatt, there was an impact on the appointment of officers in the Air Force, Navy and the Army during the pandemic period. Apart from this, the Ministry of Defence says that less recruitment in auxiliary cadres like 'Short Service Commission' (SSC) is also responsible for this shortage of officers. Significantly, the recruitment of officers in the defence forces is done through several mediums. One of them is through SSC, where cadets pass out after 11 months of training to become officers and serve in the defence forces for a fixed term of 10 to 14 years.The Defence Ministry says it is not looking at any alternative strategy like redeployment of officers to these posts to bridge the shortfall, but is looking to make 'short service' entry in the Army more attractive. However, one positive thing amid the vacancy in defence forces posts is that the Ministry of Defence has started the recruitment of women candidates in the National Defence Academy (NDA) from the year 2022. From the year 2022 till now, 57 women cadets have been recruited through NDA.\n" +
                    "\n" +
                    "Haryana leads in the number of NDA women cadets. According to the Defence Ministry, all the 57 vacancies of women cadets in NDA are fully subscribed. Of these, the maximum number of 19 female cadets are from Haryana followed by Uttar Pradesh (12). According to the Defence Ministry, three women cadets each have been recruited from Delhi, Jammu & Kashmir and Punjab and two each from Himachal Pradesh and Jammu & Kashmir. A total of four women cadets from Kerala were recruited in the Army through NDA, of which one has resigned"),
            News(R.drawable.img_25," Gujarat gets a two-day election, results with Himachal","Election Results Live Updates:'We Have To Keep India First,' Says PM Modi After Gujarat Win, Congress Wrests Back Himachal\n" +
                    "Election Results 2022: The BJP is eyeing a record seventh straight term in Gujarat\n" +
                    "\n" +
                    "\n" +
                    "3\n" +
                    "New Delhi: The Bharatiya Janata Party (BJP), set for a record seventh straight term in Gujarat, has announced swearing-in ceremony on Monday. The event will be attended by Prime Minister Narendra Modi. Leads show the BJP leading in 158 seats (up 59) in Prime Minister Narendra Modi's home state. With just under 20 seats, Congress is looking at its worst show ever. The Aam Aadmi Party, or AAP, which launched an aggressive campaign to make it a three-cornered contest for the first time in Gujarat, has made inroads in the western state, largely at Congress's expense. Three prominent AAP candidates, including its chief minister face Isudan Gadhvi, have lost their seat.\n" +
                    "Himachal Pradesh, however, has proved to be a face-saver for Congress, which has taken a clear lead over the BJP after neck and neck contest after five hours of counting. The poll outcome in the hill state will decide the revival of the grand old party, which now holds power only in Rajasthan and Chhattisgarh, both of which will go to polls in 2023.\n" +
                    "\n" +
                    "In the by-elections in five states including the high-profile Lok Sabha seat of Samajwadi Party leader Mulayam Singh Yadav, the Samajwadi Party is leading in all three seats in Uttar Pradesh. Biju Janta Dal is leading in Padampur. "),
            News(R.drawable.img_26,"Who is making water on the moon?","India's moon rover confirmed the presence of sulfur and detected several other elements near the lunar south pole as it searches for signs of frozen water nearly a week after its historic moon landing, the country's space agency said Tuesday. The rover's laser-induced spectroscope instrument also detected aluminum, iron, calcium, chromium, titanium, manganese, oxygen and silicon on the lunar surface, the Indian Space Research Organization, or ISRO, said in a post on its website.\n" +
                    "The lunar rover had come down a ramp from the lander of India's spacecraft after last Wednesday's touchdown near the moon's south pole. The Chandrayan-3 Rover is expected to conduct experiments over 14 days, the ISRO has saidThe rover \"unambiguously confirms the presence of sulfur,\" ISRO said. It also is searching for signs of frozen water that could help future astronaut missions, as a potential source of drinking water or to make rocket fuel.\n" +
                    "\n" +
                    "The rover also will study the moon's atmosphere and seismic activity, ISRO Chairman S. Somnath said.\n" +
                    "On Monday, the rover's route was reprogrammed when it came close to a 13-foot-wide crater. \"It's now safely heading on a new path,\" the ISRO said.\n" +
                    "The craft moves at a slow speed of around one centimeter (half inch) per second to minimize shock and damage to the vehicle from the moon's rough terrain.\n" +
                    "\n" +
                    "After a failed attempt to land on the moon in 2019, India last week joined the United States, the Soviet Union and China as only the fourth country to achieve the milestone.\n" +
                    "The successful mission showcases India's rising standing as a technology and space powerhouse and dovetails with the image that Prime Minister Narendra Modi is trying to project: an ascendant country asserting its place among the global elite.\n" +
                    "\n"),
            News(R.drawable.img_27,"A Chinese mystery over missing ministers","China’s defence minister has not been seen in almost three weeks, amid reports that he is under investigation, in the latest case of a senior Communist party official to disappear from public view.\n" +
                    "Gen Li Shangfu was last seen on 29 August when he gave a speech to the China-Africa peace and security forum. His last overseas trip was to Moscow and Minsk in mid-August, where he met Russian officials on the sidelines of a security conference, and with the Belarusian president, Alexander Lukashenko.\n" +
                    "Reuters reported on Friday that Li has been placed under investigation by Chinese authorities, citing 10 people familiar with the matter. The investigation into Li relates to procurement of military equipment, a regional security official and three people in direct contact with the Chinese military told the news agency.\n" +
                    "Senior officials from the Chinese military’s procurement unit, which Li led from 2017 to 2022, were also under investigation, two of the people in contact with the military reportedly said. The investigation into Li, who was appointed as defence minister in March, and the eight officials, was being carried out by the military’s powerful disciplinary inspection commission, those two people said.A Chinese foreign ministry spokesperson told reporters on Friday that she was not aware of the situation. The state council and the defence ministry did not immediately return requests for comment. Li could not immediately be reached.\n" +
                    "Earlier on Friday, the Financial Times reported that the US government believed Li had been put under investigation, citing senior officials.\n" +
                    "\n" +
                    "Reuters said Li cancelled a meeting with Vietnamese defence officials at the last minute last week. Two Vietnamese officials told the news agency that Beijing had postponed the annual meeting.Rahm Emanuel, the US ambassador to Japan, has been particularly vocal about the mystery, likening Xi Jinping’s cabinet to the Agatha Christie novel And Then There Were None.\n" +
                    "On Friday, he posted on X/Twitter claiming Li had not appeared at a scheduled meeting with the Singaporean chief of navy because he was “placed under house arrest”. He did not provide a source for the claims.\n" +
                    "Emanuel’s office and the Singaporean navy have been contacted for comment.\n" +
                    "Li’s disappearance follows the surprise removal from his post in July of the Chinese foreign minister, Qin Gang, also after a weeks-long disappearance. There has been no further information or sign of him since.\n" +
                    "Xi also replaced two top generals of the Rocket Force in early August, in a major shake-up of the military wing’s leadership. The former commander Li Yuchao had not been seen in public for weeks prior, and there was no explanation of his removal.\n" +
                    "Since coming to power in 2013, Xi has run an extensive and unforgiving anti-corruption drive that analysts say also targeted political opponents. There has been a particular crackdown on corruption in the People’s Liberation Army (PLA).\n" +
                    "But more than a decade into his rule, and after the greatest consolidation of power around a Chinese leader since Mao Zedong, senior ranks are now largely all Xi’s allies.\n" +
                    "“It would be remarkable that in year 11 of Xi being in charge of the PLA there is still such high-level corruption, and for the Rocket Force officers and Li Shangfu, Xi can not blame his predecessors,” wrote the China analyst Bill Bishop on Friday.\n" +
                    "Drew Thompson, a senior fellow at the Lee Kuan Yew School of Public Policy, said Li and Qin were the international community’s “gateway to an opaque system” and their disappearances were concerning.\n" +
                    "“It’s kind of shocking that in three months China has disappeared both the foreign and defence ministers,” said Thompson, who is also a former US state department official.\n" +
                    "“These are two critical foreign interlocutors but China feels no obligation to inform the international community how or why [the ministers have gone]. It reinforces how inward China has turned.”\n" +
                    "Li was appointed defence minister in March, after a few months as the highest-ranked member of the central military commission, which oversees the armed forces. In 2018, as director of the military’s equipment development department he was sanctioned by the US over the PLA’s purchase of Russian military equipment.\n" +
                    "Li’s biography and title remained online at the time of publication. After Qin’s removal, references to him as foreign minister were quickly scrubbed from Chinese internet sites, though some were later restored.\n" +
                    "In China’s political system ministers are not the highest ranking in a particular portfolio. As defence minister, Li reports to two vice-chairs in the central military commission, who then report to Xi. However, he is also one of five state councillors, which ranks higher than a regular minister. Qin remains a state councillor."),
            News(R.drawable.img_28,"Chandrayaan-1 data suggests electrons from Earth forming water on Moon","The Chandrayaan-1 mission detected hydroxyl molecules on the Moon's surface, which suggests that high energy electrons in the plasma sheet are indeed playing a role in the formation of water on the Moon.\n" +
                    "\n" +
                    "Earth's plasma sheet, which contains high energy electrons, is believed to play a significant role in weathering processes on the lunar surface. The magnetosphere, an area of space controlled by Earth's magnetic field, serves as a protective shield against space weathering and harmful solar radiation.\n" +
                    "\n" +
                    "The high energy electrons in Earth's plasma sheet is said to interact with the Moon's surface in a number of ways. For example, they can cause sputtering, which is the process of atoms being ejected from the surface of a solid material. They can also cause chemical reactions, which can lead to the formation of new molecules.\n" +
                    "\n" +
                    "One of the most important effects of high energy electrons on the Moon's surface is the formation of water. When high energy electrons interact with the Moon's rocks and soil, they can produce hydroxyl molecules (OH), which are the building blocks of water.\n" +
                    "\n" +
                    "Earlier, scientists mainly focused on the impact of high energy ions on the space weathering of the Moon and other airless bodies. Space weathering is the process by which the surfaces of airless bodies are modified by exposure to the space environment, including the solar wind, cosmic rays, and micrometeoroids.\n" +
                    "\n" +
                    "High energy ions can cause a variety of effects on the surfaces of airless bodies, including sputtering, implantation, and amorphization. Sputtering is the process of atoms being ejected from the surface of a solid material. Implantation is the process of atoms being embedded into the surface of a solid material. Amorphization is the process of a crystalline material being converted into a non-crystalline material.\n" +
                    "\n" +
                    "The solar wind is a continuous stream of charged particles that flows from the Sun. The solar wind contains a variety of high energy ions, including protons, alpha particles, and heavier ions.\n" +
                    "\n" +
                    "The solar wind was thought to be one of the primary mechanisms for water formation on the Moon. \n" +
                    "However, Li's research suggests that there may be additional processes or sources of water not directly associated with the implantation of solar wind protons.\n" +
                    "\n" +
                    "\"To my surprise, the remote sensing observations showed that the water formation in Earth’s magnetotail is almost identical to the time when the Moon was outside of the Earth’s magnetotail,\" Li said.\n" +
                    "\n" +
                    "\"This indicates that, in the magnetotail, there may be additional formation processes or new sources of water not directly associated with the implantation of solar wind protons. In particular, radiation by high energy electrons exhibits similar effects as the solar wind protons,” Li added.\n" +
                    "\n" +
                    "The recent revelations by Li and her earlier findings on the rusting of iron in the Moon's polar regions due to oxygen in Earth's magnetotail brings out the hidden and unrecognised connections between Earth and its Moon.Li also looks to research more via the Nasa's Artemis programs, for monitoring the plasma environment and water content on the lunar polar surface as the Moon traverses different phases of Earth's magnetotail."),
            News(R.drawable.img,"Why spotlight is on rugby's 'inconsistent' head contact laws","The application of rugby union’s rules around head-on-head contact is in the spotlight again following three incidents in the first round of matches at this year's Rugby World Cup.\n" +
                    "\n" +
                    "On Saturday, England saw a player shown a red card for the fourth time this year when Tom Curry was sent off following a head-on-head collision with Argentina full-back Juan Cruz Mallia just three minutes into the contest." +
                    "What do World Rugby's laws say?\n" +
                    "Head-on-head contact in the tackle comes under Law 9 of the Laws of Rugby Union, which covers foul play. Law 9.11 dictates \"Players must not do anything that is reckless or dangerous to others\" and the referee is always entitled to issue a yellow or red card for any actions which contravene that.\n" +
                    "\n" +
                    "Under the head contact decision-making process for officials issued by the global governing body in March 2021, considerations for whether foul play occurred in the case of head-on-head contact are if the actions of the player were intentional, reckless, and/or avoidable.\n" +
                    "\n" +
                    "Mitigation in terms of issuing a red or yellow card as a sanction along with a penalty can be applied if there was a sudden or significant change in height or direction from the ball carrier, a late change in dynamics due to contact from another player, and the tackler making an effort to wrap their arms around the ball carrier." +
                    "However, there can be no mitigation if an act of foul play is deemed to be intentional or highly reckless." +
                    "What part do the TMO and FPRO/Bunker play?\n" +
                    "Curry's dismissal and the sin-binning issued to Chile captain Sigren both fell under the purview of the Bunker review system which has been introduced for this World Cup to allow a Foul Play Review Official (FPRO) extra time to adjudicate on incidents where a red card is not a clear and obvious sanction.\n" +
                    "\n" +
                    "In each instance, the original incident was flagged to the on-field referee by the Television Match Official, with Mathieu Raynal and Nic Berry both issuing yellow cards in the first instance after viewing replays on the big screen and crossing their arms to indicate a Bunker review would take place as well.\n" +
                    "\n" +
                    "Once a player is in the sin-bin, the FPRO has up to eight minutes to review the decision at length to decide if the act of foul play warrants upgrading to a red card. If not, the player will return to the field after their 10 minutes in the sin-bin has elapsed"),
            News(R.drawable.img_1,"England and Scotland battle for Anderson | Clarke: 'He's got a choice to make'","Anderson's Newcastle team-mate, Barnes, is reported to be considering a switch of allegiance after playing once for England in a friendly win over Wales three years ago.\n" +
                    "\n" +
                    "When asked about Barnes, Clarke said: \"Probably the same comment, to think about that after.\n" +
                    "\n" +
                    "\"We want the best players we can possibly get. If they are eligible for Scotland and they have a chance to play for us and they can improve the squad that I've got - which is not an easy thing to do...\n" +
                    "\n" +
                    "\"And I get all the story round it, because we are playing England you want to speak about Elliot, you want to speak about Harvey.\n" +
                    "\n" +
                    "\"I quite like speaking about the boys I have got because they have put us in a really good position and they deserve a lot of credit for that.\"" +
                    "Southgate: International allegiance a complex issue\n" +
                    "Gareth Southgate speaking about both Harvey Barnes and Elliot Anderson:\n" +
                    "\n" +
                    "\"Both are very good players. Harvey [Barnes] has played for us and we have lots of competition. We are monitoring him and we like him a lot. Elliot Anderson has progressed really well and we have previously spoken with him but he's with Scotland and we thought that was that. He had a great pre-season and Newcastle rate him highly. I don't know the answer to the question [about both players' international futures].\n" +
                    "\n" +
                    "\"There will be more of these situations with players of dual or triple nationality, it's complicated. Sometimes you can't offer the player a pathway as quick as he would like. We've benefitted from it and lost players from it. That will always be the case."),
            News(R.drawable.img_2,"Royal hope Desert Hero among nine left in Leger contention","The William Haggas-trained Sea The Stars colt has already entered the record books once this season, when winning the King George V Stakes at Royal Ascot" +
                    "On that occasion, it was the first time the King and Queen's colours had been victorious at the Royal meeting since the death of the late Queen, and having enhanced his reputation in the Gordon Stakes at Goodwood he now has the chance to follow in the footsteps of Dunfermline, who carried the royal silks to glory in 1977." +
                    "On that occasion, it was the first time the King and Queen's colours had been victorious at the Royal meeting since the death of the late Queen, and having enhanced his reputation in the Gordon Stakes at Goodwood he now has the chance to follow in the footsteps of Dunfermline, who carried the royal silks to glory in 1977." +
                    "Simon and Ed Crisford's Chesspiece is the sole Godolphin representative and was second behind Desert Hero on the Sussex Downs, while John and Thady Gosden could saddle three in the race having confirmed both market leader Gregory and the Juddmonte-owned Arrest as well as supplementing Melrose winner Middle Earth.\n" +
                    "\n" +
                    "Oisin Murphy rides the latter and is excited about his prospects. He told Sky Sports Racing: \"He has to step up on his Melrose victory, but the form has been franked. He beat Naqeeb at Newmarket in the novice and he won really at Haydock (on Saturday) and Kempton the time before, so hopefully he's improving and I'm looking forward to riding him."),
            News(R.drawable.img_3,"Durham secure promotion back to County Championship Division One","Durham will return back to Division One of the County Championship for the first time in seven years; they were relegated in 2016 after a points deduction for financial issues; Durham have won the County Championship three times, the last time back in 2013" +
                    "Although Durham did not play a game this week, as Leicestershire were unable to gain any batting bonus points against Sussex and are subsequently unable to beat Durham's tally of 198, they head back to Division One for the first time since 2016."),
            News(R.drawable.img_4,"Lowry excited by pre-Ryder Cup statement | 'Step in right direction","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
            News(R.drawable.img_5,"Tua's Dolphins provide the NFL's perfect welcome back","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
            News(R.drawable.img_6,"Chamberlain wants a world title and revenge","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
            News(R.drawable.img_7,"When is the BMW PGA Championship? Ryder Cup stars ready for Wentworth","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
            News(R.drawable.img_8,"Djokovic celebrates 24th US Open title win with tribute to Bryant","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Low    val snews4 = News(R.drawable.img_4,\"Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\\n\" +\n" +
                    "            \"\\n\" +\n" +
                    "            \"Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs.\" +\n" +
                    "            \"Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\\n\" +\n" +
                    "            \"\\n\" +\n" +
                    "            \"\\\"It's hard but there's so many positives to take away from the week,\\\" Lowry said. \\\"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week.\")\nry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
            News(R.drawable.img_9,"Russell certain Scotland can bounce back from South Africa loss","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
            News(R.drawable.img_10,"Page determined to see out Wales contract | 'Beating Latvia would relieve pressure'","Shane Lowry finished tied-third and two strokes behind winner Vincent Norrman after an impressive week at the Irish Open; Lowry will attempt to defend his BMW PGA Championship title ahead of appearing for Team Europe in the Ryder Cup this monthShane Lowry believes his game is heading in the right direction ahead of the Ryder Cup after responding to doubters over his captain’s pick by impressing at the Horizon Irish Open.\n" +
                    "\n" +
                    "Lowry is without a victory since last September's BMW PGA Championship and experienced a disappointing campaign on the PGA Tour, where he failed to qualify for the season-ending FedExCup playoffs." +
                    "Lowry then bounced back to threaten a home victory at the K Club on Sunday, where a final-round 68 left him tied-third - his best finish of the year - and two strokes behind winner Vincent Norrman.\n" +
                    "\n" +
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week."),
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
                    "A protester holds a sign calling for the conviction of Seattle Police officer Kevin Dave, who hit and killed Jaahnavi Kandula while driving a police cruiser in January, as people protest after body camera footage was released of a Seattle police officer joking about Kandula's death, outside the Seattle Police Department's West Precinct in Seattle."),
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
        val adapter = RVAdapterall(news_data)
        recyclerView.adapter = adapter
    }
}