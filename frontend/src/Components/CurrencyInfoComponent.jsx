import React, { Component } from "react";
import SplitPane from "react-split-pane";

class CurrencyInfoComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rank: "1",
      price: "9564.85130437",
      price_date: "2020-06-01T00:00:00Z",
      price_timestamp: "2020-06-01T14:39:00Z",
      circulating_supply: "18391300",
      max_supply: "21000000",
    };
  }
  render() {
    return (
      <SplitPane split="horizontal">
        <div className="Header_root">
          <h1 className="Header_title">ReactStickyHeader</h1>

          <ul className="Header_links">
            <li className="Header_link">When</li>
            <li className="Header_link">Why</li>
            <li className="Header_link">About</li>
          </ul>
        </div>

        <section>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Rhoncus
            est pellentesque elit ullamcorper dignissim. Eget sit amet tellus
            cras adipiscing enim eu turpis egestas. In mollis nunc sed id. Purus
            in mollis nunc sed id. Volutpat est velit egestas dui id ornare arcu
            odio. Ullamcorper eget nulla facilisi etiam dignissim diam quis
            enim. Proin libero nunc consequat interdum varius sit amet mattis.
            Nulla facilisi cras fermentum odio eu feugiat. Porttitor leo a diam
            sollicitudin tempor id. Velit egestas dui id ornare arcu odio ut.
            Enim nulla aliquet porttitor lacus luctus accumsan tortor posuere
            ac. In massa tempor nec feugiat nisl pretium fusce id velit.
            Fringilla ut morbi tincidunt augue interdum velit euismod in. Nullam
            non nisi est sit. Vitae justo eget magna fermentum iaculis eu non
            diam. Nascetur ridiculus mus mauris vitae ultricies leo integer.
            Eget velit aliquet sagittis id consectetur purus. Nunc non blandit
            massa enim nec. Eget mi proin sed libero enim sed faucibus. Elit ut
            aliquam purus sit amet luctus. Ac orci phasellus egestas tellus
            rutrum tellus pellentesque eu tincidunt. Lectus vestibulum mattis
            ullamcorper velit sed ullamcorper morbi tincidunt. Amet aliquam id
            diam maecenas ultricies mi eget. Mattis nunc sed blandit libero
            volutpat. Iaculis nunc sed augue lacus viverra vitae. Est ante in
            nibh mauris cursus. Erat velit scelerisque in dictum non
            consectetur. Quisque sagittis purus sit amet volutpat consequat
            mauris nunc congue. Sed elementum tempus egestas sed sed risus
            pretium. Dictum at tempor commodo ullamcorper a lacus vestibulum
            sed. Pellentesque massa placerat duis ultricies lacus sed turpis
            tincidunt id. Semper viverra nam libero justo laoreet sit amet. Nisi
            lacus sed viverra tellus in. Integer malesuada nunc vel risus
            commodo viverra. Bibendum ut tristique et egestas quis ipsum
            suspendisse. Leo in vitae turpis massa sed. Fringilla phasellus
            faucibus scelerisque eleifend donec pretium vulputate. Justo nec
            ultrices dui sapien eget mi. Viverra maecenas accumsan lacus vel
            facilisis volutpat. Lacinia quis vel eros donec ac odio. Bibendum
            enim facilisis gravida neque convallis a cras semper. Enim blandit
            volutpat maecenas volutpat blandit aliquam. Nec nam aliquam sem et
            tortor consequat id porta. Ultricies mi quis hendrerit dolor magna
            eget est. Etiam erat velit scelerisque in dictum non consectetur a.
            Dignissim cras tincidunt lobortis feugiat vivamus at. Est
            pellentesque elit ullamcorper dignissim. Dictumst quisque sagittis
            purus sit amet volutpat consequat. Eget arcu dictum varius duis at
            consectetur lorem donec. Hendrerit dolor magna eget est lorem.
            Tincidunt augue interdum velit euismod in pellentesque massa
            placerat duis. Fermentum et sollicitudin ac orci phasellus egestas
            tellus. Auctor elit sed vulputate mi sit amet mauris commodo quis.
            Volutpat ac tincidunt vitae semper quis lectus nulla at. Ultricies
            integer quis auctor elit sed vulputate mi sit. Mi tempus imperdiet
            nulla malesuada pellentesque elit. Sapien pellentesque habitant
            morbi tristique senectus et netus. Ut lectus arcu bibendum at. Nisl
            condimentum id venenatis a. Vitae aliquet nec ullamcorper sit amet
            risus nullam eget. Adipiscing vitae proin sagittis nisl rhoncus
            mattis rhoncus. Sed arcu non odio euismod lacinia at quis risus.
            Diam phasellus vestibulum lorem sed risus ultricies. Mauris in
            aliquam sem fringilla ut morbi tincidunt augue. Vitae proin sagittis
            nisl rhoncus mattis. Arcu ac tortor dignissim convallis aenean et
            tortor at. Id interdum velit laoreet id donec ultrices tincidunt
            arcu. Curabitur gravida arcu ac tortor dignissim. Non enim praesent
            elementum facilisis leo vel fringilla est ullamcorper. Velit euismod
            in pellentesque massa placerat duis. Ornare arcu odio ut sem.
          </p>
        </section>
      </SplitPane>
    );
  }
}
export default CurrencyInfoComponent;
