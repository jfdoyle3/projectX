import React, { Component } from "react";
import SplitPane from "react-split-pane";
import "../css/currency.css";

class CurrencyHeaderComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      id: "BTC",
      currency: "BTC",
      symbol: "BTC",
      name: "Bitcoin",
      logo_url:
        "https://s3.us-east-2.amazonaws.com/nomics-api/static/images/currencies/btc.svg",
      rank: "1",
      price: "9564.85130437",
      circulating_supply: "18391300",
      max_supply: "21000000",
    };
  }
  render() {
    return (
      <SplitPane split="horizontal">
        <pane>
          <div className="container">
            <div className="row">
              <div className="col s6">
                <span>
                  <h2>{this.state.name}</h2>
                  <h6>Symbol: {this.state.symbol}</h6>
                  <h6>Rank: {this.state.rank}</h6>
                  <h6>Price: {this.state.price}</h6>
                  <h6>Circulating Supply: {this.state.circulating_supply}</h6>
                  <h6>Max Supply: {this.state.max_supply}</h6>
                </span>
              </div>
              <div className="col s6">
                <span>
                  <img src={this.state.logo_url} alt="logo" />
                </span>
              </div>
            </div>
          </div>
        </pane>
        <div>
          <pane>
            <p>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
              eiusmod tempor incididunt ut labore et dolore magna aliqua.
              Volutpat blandit aliquam etiam erat velit scelerisque in dictum.
              Elementum nisi quis eleifend quam adipiscing vitae proin sagittis.
              Viverra suspendisse potenti nullam ac tortor vitae purus. Odio ut
              sem nulla pharetra diam sit. Rhoncus mattis rhoncus urna neque
              viverra justo nec ultrices. Tortor aliquam nulla facilisi cras
              fermentum odio eu. Vulputate odio ut enim blandit volutpat
              maecenas volutpat blandit aliquam. In eu mi bibendum neque egestas
              congue. Ac turpis egestas integer eget aliquet nibh praesent
              tristique. Turpis nunc eget lorem dolor sed viverra ipsum nunc
              aliquet. A erat nam at lectus urna. Pellentesque pulvinar
              pellentesque habitant morbi. Auctor neque vitae tempus quam
              pellentesque nec. Purus semper eget duis at tellus at urna.
              Dapibus ultrices in iaculis nunc sed augue lacus viverra. Rhoncus
              dolor purus non enim praesent elementum facilisis. Velit egestas
              dui id ornare. Netus et malesuada fames ac turpis egestas maecenas
              pharetra convallis. Vivamus at augue eget arcu dictum varius duis
              at consectetur. Tincidunt nunc pulvinar sapien et ligula
              ullamcorper malesuada proin. Urna condimentum mattis pellentesque
              id. Dignissim sodales ut eu sem. Magna ac placerat vestibulum
              lectus mauris ultrices eros. Morbi quis commodo odio aenean.
              Auctor augue mauris augue neque gravida in. Urna nunc id cursus
              metus aliquam eleifend mi in nulla. Accumsan in nisl nisi
              scelerisque. Malesuada bibendum arcu vitae elementum curabitur.
              Pellentesque diam volutpat commodo sed egestas egestas fringilla
              phasellus. Adipiscing elit pellentesque habitant morbi tristique.
              Massa tincidunt dui ut ornare lectus sit amet est. Morbi quis
              commodo odio aenean sed adipiscing diam donec adipiscing. At
              consectetur lorem donec massa sapien faucibus et. In ante metus
              dictum at tempor commodo ullamcorper. Cursus euismod quis viverra
              nibh cras pulvinar mattis nunc. Elementum facilisis leo vel
              fringilla est. Maecenas pharetra convallis posuere morbi leo urna
              molestie at elementum. Massa vitae tortor condimentum lacinia quis
              vel eros donec. Est ullamcorper eget nulla facilisi etiam. Dui
              accumsan sit amet nulla facilisi. Odio eu feugiat pretium nibh
              ipsum consequat nisl vel pretium. Pretium fusce id velit ut tortor
              pretium. Pharetra massa massa ultricies mi quis hendrerit dolor
              magna. Sodales ut etiam sit amet nisl purus. Elit scelerisque
              mauris pellentesque pulvinar pellentesque habitant morbi. Vitae
              justo eget magna fermentum iaculis eu non diam. Risus sed
              vulputate odio ut enim blandit volutpat. Tristique senectus et
              netus et malesuada fames ac turpis. Nisi scelerisque eu ultrices
              vitae. Tellus elementum sagittis vitae et leo duis. Venenatis cras
              sed felis eget velit aliquet sagittis id consectetur. Amet cursus
              sit amet dictum sit. Ut sem viverra aliquet eget sit amet tellus
              cras. Nunc aliquet bibendum enim facilisis gravida neque. Dictum
              varius duis at consectetur lorem donec. Dui faucibus in ornare
              quam. Lectus sit amet est placerat in egestas erat imperdiet.
              Dapibus ultrices in iaculis nunc sed augue lacus viverra. Amet
              aliquam id diam maecenas ultricies mi eget mauris pharetra. In
              egestas erat imperdiet sed euismod. Felis bibendum ut tristique et
              egestas quis. Tortor aliquam nulla facilisi cras fermentum odio
              eu. Cursus turpis massa tincidunt dui ut ornare lectus sit amet.
              Gravida cum sociis natoque penatibus et magnis dis parturient. Est
              ullamcorper eget nulla facilisi etiam.
            </p>
          </pane>
        </div>
      </SplitPane>
    );
  }
}
export default CurrencyHeaderComponent;
