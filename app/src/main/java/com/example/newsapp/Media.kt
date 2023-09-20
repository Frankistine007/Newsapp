package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Media : AppCompatActivity() {


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
                    "In spite of still being an iOS-only beta app, Clubhouse is one of the major players and has been enjoying exponential growth since 2020 with over 10 million users as of April. One of its main draws is the presence of a lot of celebrities, from Elon Musk to Ashton Kutcher, who are either silent listeners or chairing sessions. Its popularity has made it the leading player in this space. We took a closer look at Clubhouse in our recent article.")

        )

        val adapter = RVAdaptermedia(news_data)
        recyclerView.adapter = adapter
    }
}