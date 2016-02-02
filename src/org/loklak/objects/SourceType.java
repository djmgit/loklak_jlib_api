/**
 *  SourceType
 *  Copyright 22.02.2015 by Michael Peter Christen, @0rb1t3r
 *  This class is the android version from the original file,
 *  taken from the loklak_server project. It may be slightly different.
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program in the file lgpl21.txt
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package org.loklak.objects;


public enum SourceType {

    USER,     // generated by a user as generic message
    IMPORT,   // generated by the administrator using an imoort
    TWITTER,  // generated at twitter and scraped from there
    FOSSASIA_API, // imported from FOSSASIA API data,
    OPENWIFIMAP,  // imported from OpenWifiMap API data
    NODELIST,     // imported from Freifunk Nodelist
    NETMON,       // imported from Freifunk Netmon
    FREIFUNK_NODE,// imported from Freifunk wifi router node (custom schema)
    NINUX,        // imported from Ninux http://map.ninux.org
    ;

    public static boolean hasValue(String value) {
        for (SourceType sourceType : SourceType.values()) {
            if (sourceType.name().equals(value))
                return true;
        }
        return false;
    }
}

