package com.example.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Sports : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.rvitems)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val news_data = listOf(

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
                    "\"It's hard but there's so many positives to take away from the week,\" Lowry said. \"Irish Opens are tournaments that are generally a struggle in the past and I felt like I was great out there all week.")

        )

        val adapter = RVAdaptersports(this,news_data)
        recyclerView.adapter = adapter
    }
}