//
//  PhotoViewController.swift
//  iosApp
//
//  Created by Marco Gomiero on 10/08/2019.
//

import UIKit

class PhotoViewController: UIViewController {

    @IBOutlet weak var labelToolbar: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        self.view.backgroundColor = Colors.backgroundColor
        
        self.labelToolbar.text = "GDG Venezia"
        self.labelToolbar.font = Fonts.get(.regular, size: Fonts.Sizes.xLarge)
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
