import React, { Component } from 'react';
import PowerManager from './PowerManagerBridge';

export default class App extends Component {
  async componentDidMount() {
   const a= await PowerManager.isHasProtectManager();
   if(a){
    PowerManager.startIntent(a.package,a.class);
   }
  }
 
}
