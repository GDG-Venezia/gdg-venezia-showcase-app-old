//
//  TextCell.swift
//  iosApp
//
//  Created by Marco Gomiero on 11/08/2019.
//

import Foundation
import UIKit

class IconTextCell: UICollectionViewCell {
    
    
    @IBOutlet weak var labelTitle: UILabel!
    @IBOutlet weak var labelSubtitle: UILabel!
    @IBOutlet weak var iconView: UIView!
    
    func setup(title: String, subtitle: String) {
        self.labelTitle.text = title
        self.labelSubtitle.text = subtitle
    }
    
}
